package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PotatoActivity extends AppCompatActivity {

    TextView ptyt,ptwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);

        ptyt = findViewById(R.id.ptyt);
        ptyt.setMovementMethod(LinkMovementMethod.getInstance());

        ptwb = findViewById(R.id.ptwb);
        ptwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}