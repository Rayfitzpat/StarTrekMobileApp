package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        MediaPlayer mp = MediaPlayer.create(MainScreen.this, R.raw.tng);
        mp.start();
    }

    public void goToMainMenu2(View view)
    {
        Intent i = new Intent(MainScreen.this, MainMenu2.class);
        MediaPlayer mp = MediaPlayer.create(MainScreen.this, R.raw.tng);
        mp.stop();
        startActivity(i);
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), LoginPage.class));
        finish();
    }
}