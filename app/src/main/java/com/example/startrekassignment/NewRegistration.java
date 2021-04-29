package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class NewRegistration extends AppCompatActivity {


    EditText mFullName, mEmail, mPassword, mPhone;
    Button mRegisterBtn;
    TextView mLoginBtn;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_registration);

        mFullName = findViewById((R.id.RegisterName));
        mEmail = findViewById((R.id.RegisterEmail));
        mPassword = findViewById((R.id.RegisterPassword));
        mPhone = findViewById((R.id.RegisterPhone));
        mRegisterBtn = findViewById((R.id.RegisterButton));
        mLoginBtn = findViewById((R.id.RegisterLogin));

        fAuth = FirebaseAuth.getInstance();

//        if(fAuth.getCurrentUser() != null){
//            startActivity(new Intent(getApplicationContext(), MainActivity.class));
//            finish();
//        }


    }
}