package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an ArrayList of Places, adding museums
        final ArrayList<Place> Museums = new ArrayList<>();
        Museums.add(new Place("Acropolis Museum", "Irodotou 2 str.", "210 1234567", R.drawable.museum_acropolis));
        Museums.add(new Place("National Museum", "Asklipiou 47 str.", "210 4589745", R.drawable.museum_national));
        Museums.add(new Place("Benaki Museum", "Harry Chapin str.", "215 3697845", R.drawable.museum_benaki));


        // Create a PlaceAdapter, whose data source is a list of Places, especially hotels in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter museumAdapter = new PlaceAdapter(getActivity(), Museums);

        View museumsView = inflater.inflate(R.layout.fragment_museums, container, false);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = museumsView.findViewById(R.id.listview_museums);
        listView.setAdapter(museumAdapter);

        // Inflate the layout for this fragment
        return museumsView;

    }
}
