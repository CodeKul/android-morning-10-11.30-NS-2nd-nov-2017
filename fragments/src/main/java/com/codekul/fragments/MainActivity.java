package com.codekul.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new ImgFragment());
    }

    public void loadFragment(Fragment frag) {

        FragmentManager mgr = getSupportFragmentManager();
        FragmentTransaction txn = mgr.beginTransaction();
        txn.replace(R.id.frameLayout, frag);
        txn.commit();
    }
}
