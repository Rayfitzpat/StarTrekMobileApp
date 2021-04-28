package com.example.startrekassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity {
    private SharedPreferences saveTheDate;
    CalendarView calendarView;
    TextView dateText;
    String savedDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = findViewById(R.id.calendarView);
        dateText= findViewById(R.id.textView11);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                savedDate = dayOfMonth + "/" + (month+1) + "/" + year;

                dateText.setText(savedDate);

                saveTheDate= getApplicationContext().getSharedPreferences("my_date", MODE_PRIVATE);

                SharedPreferences.Editor editor = saveTheDate.edit();
                editor.putString("key_date", savedDate);
                editor.commit();

                Toast.makeText(getBaseContext(),"Date Saved!!", Toast.LENGTH_SHORT).show();




            }
        });
    }

    public void goShared(View v){
        saveTheDate = getApplicationContext().getSharedPreferences("my_date",MODE_PRIVATE);

        String name = saveTheDate.getString("key_date", null);
        Toast.makeText(getBaseContext(), name,
                Toast.LENGTH_SHORT).show();

    }

}