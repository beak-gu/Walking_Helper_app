package com.kemnus.walking_helper

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity(){

    lateinit var navController : NavController

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        navController = nav_host_fragment.findNavController()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val main_gif_img = findViewById<View>(R.id.main_gif_img) as ImageView
        Glide.with(this).load(R.raw.circle).into(main_gif_img)
    }
}

