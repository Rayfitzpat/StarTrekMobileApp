package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu2);
    }

    public void goToShips(View view)
    {
        Intent i = new Intent(MainMenu2.this, Ships.class);
        startActivity(i);
    }

    public void goToCaptains(View view)
    {
        Intent i = new Intent(MainMenu2.this, Captains.class);
        startActivity(i);
    }

    public void goToSpecies(View view)
    {
        Intent i = new Intent(MainMenu2.this, Species.class);
        startActivity(i);
    }

    public void goToUniforms(View view)
    {
        Intent i = new Intent(MainMenu2.this, Uniforms.class);
        startActivity(i);
    }

    public void goToAbout(View view)
    {
        Intent i = new Intent(MainMenu2.this, About.class);
        startActivity(i);
    }

    public void goToExtras(View view)
    {
        Intent i = new Intent(MainMenu2.this, ExtraFunctions.class);
        startActivity(i);
    }
}