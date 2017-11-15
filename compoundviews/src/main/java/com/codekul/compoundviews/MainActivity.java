package com.codekul.compoundviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inflater = getLayoutInflater(); // activity

        //inflater = LayoutInflater.from(this); // adapters

        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); // activities or fragments
    }

    public void onAdd(View view) {

        LinearLayout containerLl = findViewById(R.id.containerLl);
        View vw = inflater.inflate(R.layout.compound_view, containerLl, true);
        vw.findViewById(R.id.imgVw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
