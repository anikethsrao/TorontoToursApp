package com.example.android.torontotoursapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * A simple pager adapter that represents ScreenSlidePageFragment objects, in
 * sequence.
 */
public class ScreenSlideAdapter extends FragmentStateAdapter {

    int COUNT = 3;

    public ScreenSlideAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1){
            return new TourismFragment();
        } else { //if (position == 2) {
            return new EventsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return COUNT;
    }
}