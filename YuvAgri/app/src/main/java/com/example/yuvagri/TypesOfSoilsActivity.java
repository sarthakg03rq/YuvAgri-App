package com.example.yuvagri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TypesOfSoilsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_soils);
    }

    public void Redsoil(View view) {
        startActivity(new Intent(TypesOfSoilsActivity.this,RedActivity.class));
    }

    public void Loamysoil(View view) {
        startActivity(new Intent(TypesOfSoilsActivity.this, ClayActivity.class));
    }

    public void Sandysoil(View view) {
        startActivity(new Intent(TypesOfSoilsActivity.this, BlackActivity.class));
    }
}