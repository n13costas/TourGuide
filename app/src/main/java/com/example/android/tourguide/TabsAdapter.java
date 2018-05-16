package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

//Setting the tabs adapter

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumberOfTabs;
    public TabsAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.mNumberOfTabs = numberOfTabs;
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }

    //Setting the tabs according to current position
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                HotelsFragment hotels = new HotelsFragment();
                return hotels;
            case 1:
                RestaurantsFragment restaurants = new RestaurantsFragment();
                return restaurants;
            case 2:
                MuseumsFragment museums = new MuseumsFragment();
                return museums;
            case 3:
                SightsFragment sights = new SightsFragment();
                return sights;
            default:
                return null;
        }
    }
}