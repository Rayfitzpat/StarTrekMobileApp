package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class About extends AppCompatActivity {
    private CheckBox submission;
    private RadioButton radioButton1;
    private RadioButton radioButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }

    public void goCheckSubmission(View View) {
        submission = findViewById(R.id.checkBox1);
        if (submission.isChecked()){
            Toast.makeText(getBaseContext(), "Thanks for liking my app ",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void goCheckRadioEngage(View View) {
        radioButton1 = findViewById(R.id.radioButton1);
        if (radioButton1.isChecked()) {
            MediaPlayer mp = MediaPlayer.create(About.this, R.raw.engage);
            mp.start();
        }
    }
        public void goCheckRadioMakeItSo (View View){
            radioButton2 = findViewById(R.id.radioButton2);
            if (radioButton2.isChecked()) {
                MediaPlayer mp = MediaPlayer.create(About.this, R.raw.makeitso);
                mp.start();
            }
        }


    public void goWebView(View view)
    {
        Intent i = new Intent(About.this, StarTrek.class);
        startActivity(i);
    }

    public void goIndex(View view)
    {
        Intent i = new Intent(About.this, Index.class);
        startActivity(i);
    }


    public void goToVector(View view)
    {
        Intent i = new Intent(About.this, Vector.class);
        startActivity(i);
    }

}