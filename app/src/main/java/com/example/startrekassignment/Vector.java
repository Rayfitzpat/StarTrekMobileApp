package com.example.startrekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Vector extends AppCompatActivity {

    private EditText text;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);

        text = findViewById(R.id.textBoxID);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Vector.this, TextOutput.class);
                String thename = text.getText().toString();
                i.putExtra("Name", thename);
                startActivity(i);
            }
        });
    }

    public void goChangeVector(View view)
    {
        ImageView imageView = findViewById(R.id.imageView33);
        imageView.setImageResource(R.drawable.ic_baseline_moped_24);
    }

    public void goChangeVectorBack(View view)
    {
        ImageView imageView = findViewById(R.id.imageView33);
        imageView.setImageResource(R.drawable.ic_baseline_lightbulb_24);
    }

}