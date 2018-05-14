package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an ArrayList of Places, adding sights
        final ArrayList<Place> Sights = new ArrayList<>();
        Sights.add(new Place("Acropolis", "Irodotou 2 str.", "210 1234567", R.drawable.sight_acropolis));
        Sights.add(new Place("Sounio", "Asklipiou 47 str.", "210 4589745", R.drawable.sight_sounio));
        Sights.add(new Place("Odeon Irodou Attikou", "Harry Chapin str.", "215 3697845", R.drawable.sight_irodou));


        // Create a PlaceAdapter, whose data source is a list of Places, especially sight in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter sightsAdapter = new PlaceAdapter(getActivity(), Sights);

        View sightsView = inflater.inflate(R.layout.fragment_sights, container, false);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = sightsView.findViewById(R.id.listview_sights);
        listView.setAdapter(sightsAdapter);

        // Inflate the layout for this fragment
        return sightsView;

    }
}
