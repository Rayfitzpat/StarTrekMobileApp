package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Riker extends AppCompatActivity {

    private MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riker);

        VideoView vd = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.riker);
        mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();
        vd.setVideoURI(uri);
        vd.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_do, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.exit) {
            Intent i = new Intent(Riker.this, Captains.class);
            startActivity(i);
//            Toast.makeText(this, "Test 1", Toast.LENGTH_SHORT).show();
            return true;
        }

        else  if (id == R.id.next) {
//            Intent i = new Intent(Riker.this, Riker.class);
//            startActivity(i);
            Toast.makeText(this, "This is the end of the list", Toast.LENGTH_SHORT).show();
            return true;
        }

        else  if (id == R.id.previous) {
            Intent i = new Intent(Riker.this, Picard.class);
            startActivity(i);
//            Toast.makeText(this, "This is the start of the list", Toast.LENGTH_SHORT).show();
//            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}