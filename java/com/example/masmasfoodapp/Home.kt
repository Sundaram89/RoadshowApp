package com.example.masmasfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.masmasfoodapp.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.ismaeldivita.chipnavigation.ChipNavigationBar

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    lateinit var navigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigationView=findViewById(R.id.bottom_nav)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_cont,HomeFragment()).commit()
        navigationView.setSelectedItemId(R.id.home)
        navigationView.setOnItemSelectedListener { item->
            var fragment:Fragment?=null
            when(item.itemId)
            {
                R.id.home->fragment=HomeFragment()
                R.id.profile->fragment=ProfileFragment()
                R.id.addcart->fragment=AddcartFragment()
                R.id.chat->fragment=ChatFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragment_cont,fragment!!).commit()
            true

        }

    }

}


