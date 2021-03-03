package com.example.android.torontotoursapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of the restaurant fragment.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment(){
        //required fragment constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //initialize rootView
        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        //create list of restaurants in toronto
        ArrayList<Toronto> restaurantList = new ArrayList<>();

        //add restaurants to restaurant list
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "canoe", "66 Wellington St W 54th floor, Toronto, ON M5K 1H6", "(416) 364-0054", 4.5));
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "Scaramouche", "1 Benvenuto Pl, Toronto, ON M4V 2L1", " (416) 961-8011", 4.7));
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "Opus", "37 Prince Arthur Ave, Toronto, ON M5R 1B2", "(416) 921-3105", 4.5));
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "Barberian's Steak House", "7 Elm St, Toronto, ON M5G 1H1", "(416) 597-0335", 4.5));
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "GEORGE", "111C Queen St E, Toronto, ON M5C 1S2", "(416) 863-6006", 4.6));
        restaurantList.add(new Toronto(R.drawable.canoe_restaurant, "Ruby Watchco", "730 Queen St E, Toronto, ON M4M 1H2", "(416) 465-0100", 4.6));

        //initialize view adapter
        RestaurantAdapter adapterView = new RestaurantAdapter(getActivity(), restaurantList);
        //initialize listView
        ListView restaurantListView = rootView.findViewById(R.id.restaurants_list_view);
        //attach view adapter
        restaurantListView.setAdapter(adapterView);

        return rootView;

    }
}