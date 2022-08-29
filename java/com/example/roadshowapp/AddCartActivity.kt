package com.example.roadshowapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.nio.file.Files.size

class AddCartActivity : AppCompatActivity() {
    lateinit var checkout:LinearLayout
    lateinit var back3:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_cart)
        back3=findViewById(R.id.back3)
        back3.setOnClickListener {
          onBackPressed()
            finish()
        }
        checkout=findViewById(R.id.ckeckout)
        checkout.setOnClickListener {
            checkout.setOnClickListener {
                val dialog = BottomSheetDialog(this)
                val view = layoutInflater.inflate(R.layout.mylayout, null)
                val placeorder= view.findViewById<LinearLayout>(R.id.placeorder)
                placeorder.setOnClickListener {
                    val intent= Intent(this,debitCardActivity::class.java)
                    startActivity(intent)
                    dialog.dismiss()
                    // on below line we are calling a dismiss
                    // method to close our dialog.

                }
                val btnClose = view.findViewById<ImageView>(R.id.cross)

                // on below line we are adding on click listener
                // for our dismissing the dialog button.
                btnClose.setOnClickListener {
                    // on below line we are calling a dismiss
                    // method to close our dialog.
                    dialog.dismiss()
                }
                // below line is use to set cancelable to avoid
                // closing of dialog box when clicking on the screen.
                dialog.setCancelable(true)

                // on below line we are setting
                // content view to our view.
                dialog.setContentView(view)
                // on below line we are calling
                // a show method to display a dialog.
                dialog.show()
            }

        }
        val recyclerview3 = findViewById<RecyclerView>(R.id.recyclerview3)
        recyclerview3.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()
        data.add(ItemsViewModel(R.drawable.shirt, "Printed Shirt", "GEETA COLLECTION", "₹28.", "00", "-", "1", "+", R.drawable.cross))
        data.add(ItemsViewModel(R.drawable.jacket, "Leather Jacket", "GEETA COLLECTION", "₹36.", "00", "-", "1", "+", R.drawable.cross, ))
        data.add(ItemsViewModel(R.drawable.jeans, "Washed Jeans", "GEETA COLLECTION", "₹19.", "00", "-", "1", "+", R.drawable.cross ))
        data.add(ItemsViewModel(R.drawable.hoddies, "Pink Hoodie", "GEETA COLLECTION", "₹45.", "00", "-", "1", "+", R.drawable.cross ))
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview3.adapter = adapter


    }
}