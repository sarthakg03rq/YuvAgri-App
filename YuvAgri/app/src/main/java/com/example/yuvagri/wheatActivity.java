package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class wheatActivity extends AppCompatActivity {

    TextView cbyt, cbwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheat);

        cbyt = findViewById(R.id.whyt);
        cbyt.setMovementMethod(LinkMovementMethod.getInstance());

        cbwb = findViewById(R.id.whwb);
        cbwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}