//package com.example.startrekassignment;
//
//
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.app.ListActivity;
//import android.content.Context;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.Toast;
//
//
//public class Captains extends ListActivity {
//
//    private static final String[] myCaptains={
//            "Archer",
//            "Pike",
//            "Kirk",
//            "Spock",
//            "Picard",
//            "Riker",
//
//            "Main Menu"
//    };
//
//    private static final String[] myLabels={
//            "Johnatan Archer\nNxo1\nFirst President of the United Federation of Planets\nBorn: August 4 2112\nNew York",
//            "Christopher Pike\nNcc-1701\nBorn: June 24 2205\nCalifornia\n",
//            "James T. Kirk\nNcc-1701A\nBorn: March 22 2233\nIowa\n",
//            "S'chn T'gai Spock\nncc-1701A\nBorn 16 November 2230\nVulcan",
//            "Jean Luc Picard\nNcc-1701D\nBorn: July 13 2355\nParis",
//            "William T. Riker\nNcc-1701E\nBorn: February 28 2335\nAlaska",
//
//            "Main Menu"
//    };
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_captains);
//
//        setListAdapter(new MyOwnAdapter());
//    }
//
//    class MyOwnAdapter extends ArrayAdapter<String> {
//        MyOwnAdapter() {
//            super(Captains.this, R.layout.my_row, R.id.label, myLabels);
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            View row=super.getView(position, convertView, parent);
//            ImageView icon=(ImageView)row.findViewById(R.id.icon);
//
//
//            if (myCaptains[position]== "Archer") //java file names
//                icon.setImageResource(R.drawable.archer);
//            if (myCaptains[position]== "Pike")
//                icon.setImageResource(R.drawable.pike);
//            if (myCaptains[position]== "Kirk")
//                icon.setImageResource(R.drawable.kirk);
//            if (myCaptains[position]== "Spock")
//                icon.setImageResource(R.drawable.spock);
//            if (myCaptains[position]== "Picard")
//                icon.setImageResource(R.drawable.picard);
//            if (myCaptains[position]== "Riker")
//                icon.setImageResource(R.drawable.riker);
//
//
//            return(row);
//        }
//    }
//
//
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//
//        try {
//            Context context = getApplicationContext();
////            CharSequence text = "This text would be for a toast";
//            int duration = Toast.LENGTH_SHORT;
//
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//            Class myClass = Class.forName("com.example.motorbikes." + myCaptains[position]);
//            Intent i = new Intent(Captains.this, myClass);
//            startActivity(i);
//        }
//        catch
//        (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//}
