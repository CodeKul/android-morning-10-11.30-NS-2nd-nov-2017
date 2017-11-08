package com.codekul.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlane(View view) {

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.html5);
    }

    public void onBus(View view) {

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ic_logo);
    }
}
