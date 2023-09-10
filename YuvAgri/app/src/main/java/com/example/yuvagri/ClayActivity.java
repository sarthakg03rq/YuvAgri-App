package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clay);
    }

    public void paddy(View view) {
        startActivity(new Intent(ClayActivity.this,PaddyActivity.class));
    }

    public void wheat(View view) {
        startActivity(new Intent(ClayActivity.this,wheatActivity.class));
    }

    public void cabbage(View view) {
        startActivity(new Intent(ClayActivity.this,CabbageActivity.class));
    }
}