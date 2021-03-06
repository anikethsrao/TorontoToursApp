package com.example.android.torontotoursapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HotelsAdapter extends ArrayAdapter<Toronto> {

    public HotelsAdapter(@NonNull Context context, @NonNull List<Toronto> objects) {
        super(context, 0, objects);
    }

    /**
     * View adapter to inflate events view
     *
     * @return current view
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        // Check if its pre inflated
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.hotels_layout, parent, false);
        }

        // Find the current position
        Toronto currentItem = getItem(position);

        // initialize the imageView and inflate
        ImageView locationImage = listView.findViewById(R.id.image);
        locationImage.setImageResource(currentItem.getImageId());

        // initialize text view for name of the location
        TextView locationName = listView.findViewById(R.id.name);
        locationName.setText(currentItem.getName());

        // initialize text view for address of the location
        TextView locationAddress = listView.findViewById(R.id.address);
        locationAddress.setText(currentItem.getAddress());

        // initialize text view for phone number of the location
        TextView locationPhoneNumber = listView.findViewById(R.id.phone);
        locationPhoneNumber.setText(currentItem.getPhoneNumber());

        // initialize text view for rating
        TextView ratingTextView = listView.findViewById(R.id.rating);
        ratingTextView.setText("" + currentItem.getRating());

        // initialize text view for website linking
        TextView websiteTextView = listView.findViewById(R.id.website);
        websiteTextView.setText(currentItem.getWebsite());

        return listView;

    }

}
