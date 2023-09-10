package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
    }
    public void jowar(View view) {
        startActivity(new Intent(RedActivity.this,JowarActivity.class));
    }
    public void potato(View view) {
        startActivity(new Intent(RedActivity.this,PotatoActivity.class));
    }
    public void greengram(View view) {
       startActivity(new Intent(RedActivity.this,GreengramActivity.class));
    }
}