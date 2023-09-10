package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CabbageActivity extends AppCompatActivity {

    TextView cbyt, cbwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabbage);

        cbyt = findViewById(R.id.cbyt);
        cbyt.setMovementMethod(LinkMovementMethod.getInstance());

        cbwb = findViewById(R.id.cbwb);
        cbwb.setMovementMethod(LinkMovementMethod.getInstance());
    }
}