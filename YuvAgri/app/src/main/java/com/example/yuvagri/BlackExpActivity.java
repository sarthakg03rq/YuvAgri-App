package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BlackExpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_exp);
    }

    public void cotton(View view) {
        startActivity(new Intent(BlackExpActivity.this,CottonActivity.class));
    }

    public void sugarcane(View view) {
        startActivity(new Intent(BlackExpActivity.this,SugarcaneActivity.class));
    }

    public void groundnut(View view) {
        startActivity(new Intent(BlackExpActivity.this,GroundnutActivity.class));
    }
}