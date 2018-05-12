package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        // Create an ArrayList of Places, adding museums
        final ArrayList<Place> Museums = new ArrayList<>();
        Museums.add(new Place("Acropolis Museum", "Irodotou 2 str.", "210 1234567", R.drawable.museum_acropolis));
        Museums.add(new Place("National Museum", "Asklipiou 47 str.", "210 4589745", R.drawable.museum_national));
        Museums.add(new Place("Benaki Museum", "Harry Chapin str.", "215 3697845", R.drawable.museum_benaki));


        // Create a PlaceAdapter, whose data source is a list of Places, especially museums in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter museumsAdapter = new PlaceAdapter(this, Museums);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = findViewById(R.id.listview_museums);
        listView.setAdapter(museumsAdapter);

    }
}
