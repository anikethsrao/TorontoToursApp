package com.example.android.torontotoursapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static com.example.android.torontotoursapp.R.drawable.canoe_restaurant;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class TourismFragment extends Fragment {

    public TourismFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_tourism, container, false);

        //create list of tourist attractions in toronto
        ArrayList<Toronto> tourismList = new ArrayList<>();

        tourismList.add(canoe_restaurant, "CN Tower", "290 Bremner Blvd", "(416) 601-4707", "https://www.cntower.ca/intro.html", 4.6);
        tourismList.add(canoe_restaurant, "CN Tower", "290 Bremner Blvd", "(416) 601-4707", "https://www.cntower.ca/intro.html", 4.6);

        return rootView;

    }
}