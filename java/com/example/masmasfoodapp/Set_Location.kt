package com.example.masmasfoodapp

import android.Manifest
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Geocoder
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.masmasfoodapp.databinding.ActivitySetLocationBinding
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.LocationSettingsStatusCodes
import java.io.IOException
import java.util.*


class Set_Location : AppCompatActivity() {
    lateinit var binding: ActivitySetLocationBinding
    lateinit var locationRequest: com.google.android.gms.location.LocationRequest
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivitySetLocationBinding.inflate(layoutInflater)
          setContentView(binding.root)
        val back3=findViewById<LinearLayout>(R.id.back3)
        back3.setOnClickListener {
            onBackPressed()
        }
        val btn8=findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {
            val intent= Intent(this,SignUp_Success::class.java)
            startActivity(intent)

        }
        fusedLocationProviderClient=LocationServices.getFusedLocationProviderClient(this)
        checkLocationPermission()

}

    private fun checkLocationPermission() {
       if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){

checkGPS()
       }
        else
       {
           ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),100)

       }
    }

    private fun checkGPS() {
     locationRequest= com.google.android.gms.location.LocationRequest.create()
        locationRequest.priority=com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY
        locationRequest.interval=5000
        locationRequest.fastestInterval=2000

        var builder=LocationSettingsRequest.Builder()
            .addLocationRequest(locationRequest)
        builder.setAlwaysShow(true)
        var result=LocationServices.getSettingsClient(
            this.applicationContext)
            .checkLocationSettings(builder.build())
        result.addOnCompleteListener {task->
            try {
              val response=task.getResult(
                  ApiException::class.java
              )
                getUserLocation()


            }catch (e: ApiException)
            {
             e.printStackTrace()
                when(e.statusCode)
                {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED ->try {
                        val resolveApiException= e as ResolvableApiException
                        resolveApiException.startResolutionForResult(this,200)

                    }catch (sendIntentException :IntentSender.SendIntentException){
                    }
                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE ->{

                    }
                }
            }

        }



    }

    private fun getUserLocation() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            return
        }
        fusedLocationProviderClient.lastLocation.addOnCompleteListener { task->
            val location=task.getResult()
            if(location!=null)
            {
                try {
                    val geocoder=Geocoder(this, Locale.getDefault())
                    val adress=geocoder.getFromLocation(location.latitude,location.longitude,1)
                     val currentAddTv=adress[0].getAddressLine(0)
                    binding.yourlocation.setText(currentAddTv)
                    val adress_location=adress[0].getAddressLine(0)
                    openlocation(adress_location.toString())
                }catch (e :IOException)
                {

                }
            }


}


    }

    private fun openlocation(location: String) {
        binding.location.setOnClickListener {
                val uri = Uri.parse("geo:,0?q=$location")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                intent.setPackage("com.google.android.apps.maps")
                startActivity(intent)

        }


    }
}