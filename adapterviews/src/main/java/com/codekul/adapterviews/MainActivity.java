package com.codekul.adapterviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<GridItem> dataSet = new ArrayList<>();
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "First")) ;
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "Second")) ;
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "Third")) ;
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "Fourth")) ;
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "Fifth")) ;
        dataSet.add(new GridItem(R.drawable.ic_launcher_background, "Sixth")) ;

        MyAdapter adapter = new MyAdapter(
                this,
                dataSet
        );

        ((GridView)findViewById(R.id.gridDash)).setAdapter(adapter);
        ((GridView)findViewById(R.id.gridDash)).setOnItemClickListener(
                (adapterView, view, i, l) -> startActivity(
                        new Intent(this, InfoActivity.class)
                )
        );
    }
}
