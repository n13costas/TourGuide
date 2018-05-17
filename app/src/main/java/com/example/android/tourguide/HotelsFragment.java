package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an ArrayList of Places, adding hotels
        final ArrayList<Place> Hotels = new ArrayList<>();
        Hotels.add(new Place(this.getResources().getString(R.string.hotel1_name), this.getResources().getString(R.string.place1_address), this.getResources().getString(R.string.place1_tel), R.drawable.hotel_hilton));
        Hotels.add(new Place(this.getResources().getString(R.string.hotel2_name), this.getResources().getString(R.string.place2_address), this.getResources().getString(R.string.place2_tel), R.drawable.hotel_bretagne));
        Hotels.add(new Place(this.getResources().getString(R.string.hotel3_name), this.getResources().getString(R.string.place3_address), this.getResources().getString(R.string.place3_tel), R.drawable.hotel_divani));

        // Create a PlaceAdapter, whose data source is a list of Places, especially hotels in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter hotelAdapter = new PlaceAdapter(getActivity(), Hotels);

        View hotelsView = inflater.inflate(R.layout.fragment_hotels, container, false);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = hotelsView.findViewById(R.id.listview_hotels);
        listView.setAdapter(hotelAdapter);

        // Inflate the layout for this fragment
        return hotelsView;

    }
}
