package com.example.android.tourguide;

public class Place {

    // Name of place
    private String mPlaceName;

    // Address of place
    private String mPlaceAddress;

    // Telephone of place
    private String mPlaceTelephone;

    // Photo of place
    private int mPlacePhotoId;

    public Place(String placeName, String placeAddress, String placeTelephone, int placePhotoId)
    {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceTelephone = placeTelephone;
        mPlacePhotoId = placePhotoId;
    }

    // Get the name of place
    public String getPlaceName() {
        return mPlaceName;
    }

    // Get the address of place
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    // Get the telephone of place
    public String getSongYear() {
        return mPlaceTelephone;
    }

    // Get the telephone of place
    public int getPlacePhotoId() {
        return mPlacePhotoId;
    }
}
