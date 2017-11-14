package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String col;
    public static final String KEY_COL = "col";
    public static final int REQ_SPRT = 4589;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CheckBox) findViewById(R.id.chkRd)).setOnCheckedChangeListener(
                (compoundButton, b) -> {
                    if (b) col = "red";
                    else col = "blue";
                    ((TextView) findViewById(R.id.txtVw)).setText(col);
                }
        );

        ((CheckBox) findViewById(R.id.chkBlu))
                .setOnCheckedChangeListener(this::checked);
    }

    private void checked(CompoundButton btn, boolean st) {
        if (btn.getId() == R.id.chkBlu) {
            if (st) col = "blue";
            else col = "red";
            ((TextView) findViewById(R.id.txtVw)).setText(col);
        }
    }

    public void onNext(View view) {
        Intent intent = new Intent(this, SportsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(KEY_COL, col);

        intent.putExtras(bundle);

        startActivityForResult(intent, REQ_SPRT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQ_SPRT) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    Bundle bndl = data.getExtras();
                    if (bndl != null) {
                        String resCol = bndl.getString(SportsActivity.KEY_RES);
                        ((TextView) findViewById(R.id.txtVw)).setText(resCol);
                    }
                }
            }
        }
    }
}
