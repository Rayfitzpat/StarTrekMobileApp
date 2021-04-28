package com.example.startrekassignment;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Index extends ListActivity {


    String[] myCountries = {
            "About",
            "Archer",
            "Captains",
            "Kirk",
            "MainScreen",
            "MainMenu2",
            "NCC1701",
            "NCC1701A",
            "NCC1701AKelvin",
            "NCC1701B",
            "NCC1701C",
            "NCC1701D",
            "NCC1701E",
            "NCC1701F",
            "NCC1701J",
            "NX01",
            "Picard",
            "Pike",
            "Riker",
            "Ships",
            "Species",
            "Spock",
            "Uniforms",
            "XCV330"
    };


    String[] myLabels = {
            "About",
            "Archer",
            "Captains",
            "Kirk",
            "Home Screen",
            "Main Menu",
            "NCC1701",
            "NCC1701A",
            "NCC1701AKelvin",
            "NCC1701B",
            "NCC1701C",
            "NCC1701D",
            "NCC1701E",
            "NCC1701F",
            "NCC1701J",
            "NX01",
            "Picard",
            "Pike",
            "Riker",
            "Ships",
            "Species",
            "Spock",
            "Uniforms",
            "XCV330"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding Array "myLabels" to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(Index.this, android.R.layout.simple_list_item_1, myLabels));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.example.startrekassignment." + myCountries[position]);
            Intent i = new Intent(Index.this, myClass);
            startActivity(i);
        }
        catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
