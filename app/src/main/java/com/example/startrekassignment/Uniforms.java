package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Uniforms extends AppCompatActivity {

    private ImageView androidIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniforms);
    }
    public void goHide(View v) {

        androidIcon =  findViewById(R.id.imageView17);
        androidIcon.setVisibility(View.GONE);
        //  androidIcon.setVisibility(View.INVISIBLE);

    }

    public void goShow(View v) {
        androidIcon = findViewById(R.id.imageView17);
        androidIcon.setVisibility(View.VISIBLE);
    }

}