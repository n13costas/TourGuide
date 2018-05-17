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
        Museums.add(new Place(this.getResources().getString(R.string.museum1_name), this.getResources().getString(R.string.place1_address), this.getResources().getString(R.string.place1_tel), R.drawable.museum_acropolis));
        Museums.add(new Place(this.getResources().getString(R.string.museum2_name), this.getResources().getString(R.string.place2_address), this.getResources().getString(R.string.place2_tel), R.drawable.museum_national));
        Museums.add(new Place(this.getResources().getString(R.string.museum3_name), this.getResources().getString(R.string.place3_address), this.getResources().getString(R.string.place3_tel), R.drawable.museum_benaki));

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
