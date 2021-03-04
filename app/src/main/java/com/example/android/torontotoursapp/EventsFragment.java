package com.example.android.torontotoursapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.torontotoursapp.R.drawable.canoe_restaurant;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);

        //create list of tourist attractions in toronto
        ArrayList<Toronto> eventsList = new ArrayList<>();

        eventsList.add(new Toronto(canoe_restaurant, "CN Tower", "290 Bremner Blvd, Toronto, ON M5V 3L9", "(416) 601-4707", "www.cntower.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.6));
        eventsList.add(new Toronto(canoe_restaurant, "Royal Ontario Museum", "100 Queens Park, Toronto, ON M5S 2C6", "(416) 586-8000", "www.rom.on.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.7));
        eventsList.add(new Toronto(canoe_restaurant, "Casa Loma", "1 Austin Terrace, Toronto, ON M5R 1X8", "(416) 923-1171", "www.casaloma.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.5));
        eventsList.add(new Toronto(canoe_restaurant, "Ripley's Aquarium", "288 Bremner Blvd, Toronto, ON M5V 3L9", "(647) 351-3474", "www.ripleyaquariums.com", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.6));
        eventsList.add(new Toronto(canoe_restaurant, "Canada's Wonderland", "1 Canada's Wonderland Drive, Vaughan, ON L6A 1S6", "(905) 832-8131", "www.canadaswonderland.com", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.5));

        EventsAdapter tourismAdapter = new EventsAdapter(getActivity(), eventsList);
        ListView tourismListView = rootView.findViewById(R.id.events_list_view);
        tourismListView.setAdapter(tourismAdapter);

        return rootView;
    }
}