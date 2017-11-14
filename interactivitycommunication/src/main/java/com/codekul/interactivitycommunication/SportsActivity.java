package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SportsActivity extends AppCompatActivity {

    public static final String KEY_RES = "res";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        Intent resInt = getIntent();

        if (resInt != null) {
            Bundle bndl = resInt.getExtras();
            if (bndl != null) {
                String nm = bndl.getString(MainActivity.KEY_COL);
                ((EditText) findViewById(R.id.edtNm)).setText(nm);
            }
        }
    }

    public void onBack(View view) {

        Intent intent = new Intent();
        Bundle bndl = new Bundle();
        bndl.putString(KEY_RES, ((EditText) findViewById(R.id.edtNm)).getText().toString());
        intent.putExtras(bndl);

        setResult(RESULT_OK, intent);
        finish();
    }
}
