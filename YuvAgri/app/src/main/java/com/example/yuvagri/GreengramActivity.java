package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class GreengramActivity extends AppCompatActivity {

    TextView ggyt, ggwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greengram);

        ggyt = findViewById(R.id.ggyt);
        ggyt.setMovementMethod(LinkMovementMethod.getInstance());

        ggwb = findViewById(R.id.ggwb);
        ggwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}