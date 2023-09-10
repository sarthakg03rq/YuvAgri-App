package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class GroundnutActivity extends AppCompatActivity {

    TextView gnyt, gnwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groundnut);

        gnyt = findViewById(R.id.gnyt);
        gnyt.setMovementMethod(LinkMovementMethod.getInstance());

        gnwb = findViewById(R.id.gnwb);
        gnwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}