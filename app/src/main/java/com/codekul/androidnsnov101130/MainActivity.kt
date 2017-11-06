package com.codekul.androidnsnov101130

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codekul.androlib.Setup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stp : Setup = Setup()
        stp.apkSetup()
    }
}
