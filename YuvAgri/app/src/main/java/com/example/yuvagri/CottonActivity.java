package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CottonActivity extends AppCompatActivity {

    TextView coyt1, cowb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotton);

        coyt1 = findViewById(R.id.coyt);
        coyt1.setMovementMethod(LinkMovementMethod.getInstance());

        cowb1 = findViewById(R.id.cowb);
        cowb1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}