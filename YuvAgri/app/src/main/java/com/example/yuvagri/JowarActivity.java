package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class JowarActivity extends AppCompatActivity {

    TextView cbyt, cbwb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jowar);

        cbyt = findViewById(R.id.jyt);
        cbyt.setMovementMethod(LinkMovementMethod.getInstance());

        cbwb = findViewById(R.id.jwb);
        cbwb.setMovementMethod(LinkMovementMethod.getInstance());

    }
}