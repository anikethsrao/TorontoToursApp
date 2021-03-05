package com.example.android.torontotoursapp;

import android.content.res.Resources;
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

        int[] imageId = {R.drawable.canoe_restaurant, R.drawable.scaramouche_restaurant, R.drawable.opus_restaurant,
            R.drawable.barberians_restaurant, R.drawable.george_restaurant, R.drawable.ruby_watchco_restaurant};
        double[] ratings = {4.5, 4.7, 4.5, 4.5, 4.6, 4.6};

        Resources res = getResources();
        String[] names = res.getStringArray(R.array.restaurant_names);
        String[] address = res.getStringArray(R.array.restaurant_address);
        String[] phones = res.getStringArray(R.array.restaurant_phone_numbers);

        //add restaurants to restaurant list
        for(int i = 0; i < imageId.length; i++){
            restaurantList.add(new Toronto(imageId[i], names[i], address[i], phones[i], ratings[i]));
        }

        // Initialize view adapter
        RestaurantAdapter adapterView = new RestaurantAdapter(getActivity(), restaurantList);
        ListView restaurantListView = rootView.findViewById(R.id.restaurants_list_view);
        restaurantListView.setAdapter(adapterView);

        return rootView;

    }
}