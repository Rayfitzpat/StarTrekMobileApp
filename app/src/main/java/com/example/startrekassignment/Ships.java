package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ships extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ships);
    }

    public void goToXCV330(View view)
    {
        Intent i = new Intent(Ships.this, XCV330.class);
        startActivity(i);
    }

    public void goToNX01(View view)
    {
        Intent i = new Intent(Ships.this, NX01.class);
        startActivity(i);
    }
    public void goToE1701(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701.class);
        startActivity(i);
    }

    public void goToE1701A(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701A.class);
        startActivity(i);
    }

    public void goToE1701B(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701B.class);
        startActivity(i);
    }

    public void goToE1701C(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701C.class);
        startActivity(i);
    }

    public void goToE1701D(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701D.class);
        startActivity(i);
    }

    public void goToE1701E(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701E.class);
        startActivity(i);
    }

    public void goToE1701F(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701F.class);
        startActivity(i);
    }

    public void goToE1701J(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701J.class);
        startActivity(i);
    }

    public void goToE1701AKelvin(View view)
    {
        Intent i = new Intent(Ships.this, NCC1701AKelvin.class);
        startActivity(i);
    }
}