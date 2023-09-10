package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SugarcaneActivity extends AppCompatActivity {

    TextView cbyt, cbwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugarcane);

        cbyt = findViewById(R.id.scyt);
        cbyt.setMovementMethod(LinkMovementMethod.getInstance());

        cbwb = findViewById(R.id.scwb);
        cbwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}