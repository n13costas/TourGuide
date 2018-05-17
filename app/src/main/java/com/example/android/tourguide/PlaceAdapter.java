package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> Places) {
        super(context, 0, Places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the place object located at this position in the list
        final Place currentPlace = getItem(position);

        ImageView placePhoto = listItemView.findViewById(R.id.image_place_photo);
        placePhoto.setImageResource(currentPlace.getPlacePhotoId());

        TextView placeName = listItemView.findViewById(R.id.text_place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeAddress = listItemView.findViewById(R.id.text_place_address);
        placeAddress.setText(currentPlace.getPlaceAddress());

        TextView placeTelephone =  listItemView.findViewById(R.id.text_place_telephone);
        placeTelephone.setText(currentPlace.getPlaceTelephone());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

