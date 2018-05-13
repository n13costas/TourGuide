package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        // Create an ArrayList of Places, adding sights
        final ArrayList<Place> Sights = new ArrayList<>();
        Sights.add(new Place("Acropolis", "Irodotou 2 str.", "210 1234567", R.drawable.sight_acropolis));
        Sights.add(new Place("Sounio", "Asklipiou 47 str.", "210 4589745", R.drawable.sight_sounio));
        Sights.add(new Place("Odeon Irodou Attikou", "Harry Chapin str.", "215 3697845", R.drawable.sight_irodou));


        // Create a PlaceAdapter, whose data source is a list of Places, especially museums in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter sightsAdapter = new PlaceAdapter(this, Sights);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = findViewById(R.id.listview_sights);
        listView.setAdapter(sightsAdapter);
    }
}
