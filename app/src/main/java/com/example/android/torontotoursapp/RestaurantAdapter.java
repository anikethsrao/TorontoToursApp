package com.example.android.torontotoursapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends ArrayAdapter<Toronto> {

    public RestaurantAdapter(Activity context, ArrayList<Toronto> toronto) {
        super(context, 0, toronto);
    }

    /**
     * View adapter to inflate restaurant view
     * @return current view
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_layout, parent, false);
        }

        //Find the current position
        Toronto currentItem = getItem(position);

        //initialize the imageView and inflate
        ImageView locationImage = listView.findViewById(R.id.image);
        locationImage.setImageResource(currentItem.getImageId());

        TextView locationName = listView.findViewById(R.id.name);
        locationName.setText(currentItem.getName());

        TextView locationAddress = listView.findViewById(R.id.address);
        locationAddress.setText(currentItem.getAddress());

        TextView locationPhoneNumber = listView.findViewById(R.id.phone);
        locationPhoneNumber.setText(currentItem.getPhoneNumber());

        return listView;
    }
}
