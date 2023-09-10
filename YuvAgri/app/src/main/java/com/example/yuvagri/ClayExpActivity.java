package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClayExpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clay_exp);
    }

    public void paddy(View view) {
        startActivity(new Intent(ClayExpActivity.this,PaddyActivity.class));
    }

    public void wheat(View view) {
        startActivity(new Intent(ClayExpActivity.this,wheatActivity.class));
    }

    public void cabbage(View view) {
        startActivity(new Intent(ClayExpActivity.this,CabbageActivity.class));
    }

}