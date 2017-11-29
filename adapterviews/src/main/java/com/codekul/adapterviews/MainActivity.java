package com.codekul.adapterviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple();
    }

    private void simple() {
        ArrayList<String> dataSet = new ArrayList<>();
        dataSet.add("Android");
        dataSet.add("iOS");
        dataSet.add("Rim");
        dataSet.add("Symbian");
        dataSet.add("Bada");
        dataSet.add("Windows");
        dataSet.add("J2ME");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dataSet
        );

        ListView lst = findViewById(R.id.lstVw);
        lst.setAdapter(adapter);
    }

    private void customList() {

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

       /* ((GridView)findViewById(R.id.gridDash)).setAdapter(adapter);
        ((GridView)findViewById(R.id.gridDash)).setOnItemClickListener(
                (adapterView, view, i, l) -> startActivity(
                        new Intent(this, InfoActivity.class)
                )
        );*/
    }
}
