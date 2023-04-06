package com.kemnus.walking_helper

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity
import android.view.View
import android.widget.*
import com.takusemba.rtmppublisher.Publisher
import com.takusemba.rtmppublisher.PublisherListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}