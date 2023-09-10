package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp);
    }

    public void Redsoil(View view) {
        startActivity(new Intent(ExpActivity.this,RedExpActivity.class));
    }

    public void Loamysoil(View view) {
        startActivity(new Intent(ExpActivity.this, ClayExpActivity.class));
    }

    public void Sandysoil(View view) {
        startActivity(new Intent(ExpActivity.this, BlackExpActivity.class));
    }
}