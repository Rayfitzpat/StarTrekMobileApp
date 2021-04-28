package com.example.startrekassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Captains2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captains2);
    }

    public void goToArcher(View view)
    {
        Intent i = new Intent(Captains2.this, Archer.class);
        startActivity(i);
    }

    public void goToPike(View view)
    {
        Intent i = new Intent(Captains2.this, Pike.class);
        startActivity(i);
    }

    public void goToKirk(View view)
    {
        Intent i = new Intent(Captains2.this, Kirk.class);
        startActivity(i);
    }

    public void goToSpock(View view)
    {
        Intent i = new Intent(Captains2.this, Spock.class);
        startActivity(i);
    }

    public void goToPicard(View view)
    {
        Intent i = new Intent(Captains2.this, Picard.class);
        startActivity(i);
    }

    public void goToRiker(View view)
    {
        Intent i = new Intent(Captains2.this, Riker.class);
        startActivity(i);
    }
}