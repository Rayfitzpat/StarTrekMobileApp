package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
    }

    public void goMail(View v){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"ray.fitz@hello.ie"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Testing 123");
        email.putExtra(Intent.EXTRA_TEXT, "Hello Ray, this is a test email");
        email.setType("message/rfc8222");
        startActivity(Intent.createChooser(email, "Send mail using:"));
    }

    public void goText(View v){
        Uri uri = Uri.parse("smsto:0834099988");
        Intent msg = new Intent(Intent.ACTION_SENDTO, uri);
        msg.putExtra("sms_body", "Hello Ray, this is a test Sms");
        startActivity(Intent.createChooser(msg, "Send sms using:"));
    }


}