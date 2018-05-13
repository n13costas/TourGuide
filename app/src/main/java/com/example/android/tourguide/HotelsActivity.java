package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        // Create an ArrayList of Places, adding hotels
        final ArrayList<Place> Hotels = new ArrayList<>();
        Hotels.add(new Place("Hilton Athens", "Irodotou 2 str.", "210 1234567", R.drawable.hotel_hilton));
        Hotels.add(new Place("Grande Bretagne", "Asklipiou 47 str.", "210 4589745", R.drawable.hotel_bretagne));
        Hotels.add(new Place("Divani Caravel", "Harry Chapin str.", "215 3697845", R.drawable.hotel_divani));


        // Create a PlaceAdapter, whose data source is a list of Places, especially hotels in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter hotelAdapter = new PlaceAdapter(this, Hotels);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = findViewById(R.id.listview_hotels);
        listView.setAdapter(hotelAdapter);

    }
}
