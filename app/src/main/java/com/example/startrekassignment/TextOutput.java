package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TextOutput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_output);

        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("Name");
            TextView tvNameReceived = findViewById(R.id.textView25);
            tvNameReceived.setText(sentText);
        } catch (RuntimeException e) {

            e.printStackTrace();
        }


    }
}