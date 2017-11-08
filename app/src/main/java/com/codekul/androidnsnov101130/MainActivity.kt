package com.codekul.androidnsnov101130

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vw = View(this)
    }

    fun onBus(view: View?) {
        imageView.setImageResource(R.drawable.ic_logo)
    }

    fun onPlane(view: View?) {
        imageView.setImageResource(R.drawable.html5)
    }
}
