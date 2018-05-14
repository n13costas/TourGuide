package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an ArrayList of Places, adding restaurants
        final ArrayList<Place> Restaurants = new ArrayList<>();
        Restaurants.add(new Place("Botrini's", "Irodotou 2 str.", "210 1234567", R.drawable.restaurant_botrinis));
        Restaurants.add(new Place("Spondi", "Asklipiou 47 str.", "210 4589745", R.drawable.restaurant_spondi));
        Restaurants.add(new Place("Funky Gourmet", "Harry Chapin str.", "215 3697845", R.drawable.restaurant_funky));


        // Create a PlaceAdapter, whose data source is a list of Places, especially restaurants in this activity.
        // The adapter knows how to create list item views for each item in the list.
        PlaceAdapter restaurantAdapter = new PlaceAdapter(getActivity(), Restaurants);

        View restaurantsView = inflater.inflate(R.layout.fragment_restaurants, container, false);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = restaurantsView.findViewById(R.id.listview_restaurants);
        listView.setAdapter(restaurantAdapter);

        // Inflate the layout for this fragment
        return restaurantsView;

    }
}
