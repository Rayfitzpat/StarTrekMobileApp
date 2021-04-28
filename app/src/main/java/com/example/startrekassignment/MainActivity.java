package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.tng);
        mp.stop();

        Thread splashTread = new Thread() {

            public void run() {
                try {
                    sleep(1500);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(MainActivity.this,LoginPage.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();
    }
}