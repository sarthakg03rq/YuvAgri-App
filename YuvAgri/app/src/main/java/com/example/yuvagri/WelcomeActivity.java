package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

//    private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                SharedPreferences sharedPreferences = getSharedPreferences(LoginActivity.PREFS_NAME,0);
//                boolean hasLoggedIn = sharedPreferences.getBoolean("hasLoggedIn",false);
//
//
//                if (hasLoggedIn){
//                    Intent intent = new Intent(WelcomeActivity.this,SoilsActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else {
//                    Intent intent = new Intent(WelcomeActivity.this,LoginActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//            }
//        },SPLASH_TIME_OUT);

    }

    public void login(View view) {
        startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
    }

    public void signup(View view) {
        startActivity(new Intent(WelcomeActivity.this,SignUpActivity.class));
    }
}