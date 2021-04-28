package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExtraFunctions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_functions);
    }

    public void goToCamera(View view)
    {
        Intent i = new Intent(ExtraFunctions.this, Camera.class);
        startActivity(i);
    }

    public void goToCalandar(View view)
    {
        Intent i = new Intent(ExtraFunctions.this, Calendar.class);
        startActivity(i);
    }

    public void goToSms(View view)
    {
        Intent i = new Intent(ExtraFunctions.this, Sms.class);
        startActivity(i);
    }


}