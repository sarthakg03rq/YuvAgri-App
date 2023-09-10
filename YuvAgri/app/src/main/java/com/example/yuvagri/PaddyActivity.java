package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PaddyActivity extends AppCompatActivity {

    TextView pcyt1, pcyt2, pcyt3, pcyt4, pcyt5, pcwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paddy);

        pcyt1 = findViewById(R.id.pcyt1);
        pcyt1.setMovementMethod(LinkMovementMethod.getInstance());

        pcyt2 = findViewById(R.id.pcyt2);
        pcyt2.setMovementMethod(LinkMovementMethod.getInstance());

        pcyt3 = findViewById(R.id.pcyt3);
        pcyt3.setMovementMethod(LinkMovementMethod.getInstance());

        pcyt4 = findViewById(R.id.pcyt4);
        pcyt4.setMovementMethod(LinkMovementMethod.getInstance());

        pcyt5 = findViewById(R.id.pcyt5);
        pcyt5.setMovementMethod(LinkMovementMethod.getInstance());

        pcwb = findViewById(R.id.pcwb);
        pcwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}