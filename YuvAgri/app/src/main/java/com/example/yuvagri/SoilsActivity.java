package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SoilsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soils);

        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentuser = auth.getCurrentUser();
        if (currentuser==null){
            startActivity(new Intent(SoilsActivity.this,WelcomeActivity.class));
            finish();
            return;
        }

        Button btnlogout = findViewById(R.id.btnlogout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logoutUser();
            }
        });

    }

    private void logoutUser() {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(SoilsActivity.this,WelcomeActivity.class));
        finish();
    }

    public void types(View view) {
        startActivity(new Intent(SoilsActivity.this,ExpActivity.class));
    }
}