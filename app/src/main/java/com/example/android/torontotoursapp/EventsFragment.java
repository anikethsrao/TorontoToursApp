package com.example.android.torontotoursapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

import static com.example.android.torontotoursapp.R.drawable.canoe_restaurant;
import static com.example.android.torontotoursapp.R.drawable.casa_loma;
import static com.example.android.torontotoursapp.R.drawable.cn_tower_tourism;
import static com.example.android.torontotoursapp.R.drawable.ripleys_aquarium_tourism;
import static com.example.android.torontotoursapp.R.drawable.rom_tourism;
import static com.example.android.torontotoursapp.R.drawable.wonderland_tourism;

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

        // Create list of tourist attractions in toronto
        ArrayList<Toronto> eventsList = new ArrayList<>();

        // Add objects to list
        eventsList.add(new Toronto(cn_tower_tourism, "CN Tower", "290 Bremner Blvd, Toronto, ON M5V 3L9", "(416) 601-4707", "www.cntower.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.6));
        eventsList.add(new Toronto(rom_tourism, "Royal Ontario Museum", "100 Queens Park, Toronto, ON M5S 2C6", "(416) 586-8000", "www.rom.on.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.7));
        eventsList.add(new Toronto(casa_loma, "Casa Loma", "1 Austin Terrace, Toronto, ON M5R 1X8", "(416) 923-1171", "www.casaloma.ca", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.5));
        eventsList.add(new Toronto(ripleys_aquarium_tourism, "Ripley's Aquarium", "288 Bremner Blvd, Toronto, ON M5V 3L9", "(647) 351-3474", "www.ripleyaquariums.com", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.6));
        eventsList.add(new Toronto(wonderland_tourism, "Canada's Wonderland", "1 Canada's Wonderland Drive, Vaughan, ON L6A 1S6", "(905) 832-8131", "www.canadaswonderland.com", "NO DATES AVAILABLE DUE TO LOCK DOWN", 4.5));

        // Attach fragment adapter
        EventsAdapter eventsAdapter = new EventsAdapter(getActivity(), eventsList);
        ListView eventsListView = rootView.findViewById(R.id.events_list_view);
        eventsListView.setAdapter(eventsAdapter);

        // Attach tab layout to view pager
        //ViewPager2 viewPager = rootView.findViewById(R.id.pager);
        //TabLayout tabLayout = rootView.findViewById(R.id.tabs);
        //new TabLayoutMediator(tabLayout, viewPager,(tab, position) -> tab.setText("Events")).attach();

        return rootView;
    }
}