package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BlackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black);
    }

    public void cotton(View view) {
        startActivity(new Intent(BlackActivity.this,CottonActivity.class));
    }

    public void sugarcane(View view) {
        startActivity(new Intent(BlackActivity.this,SugarcaneActivity.class));
    }

    public void groundnut(View view) {
        startActivity(new Intent(BlackActivity.this,GroundnutActivity.class));
    }
}