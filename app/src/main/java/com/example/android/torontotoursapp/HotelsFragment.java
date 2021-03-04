package com.example.android.torontotoursapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.torontotoursapp.R.drawable.fairmont_hotels;
import static com.example.android.torontotoursapp.R.drawable.hilton_toronto;
import static com.example.android.torontotoursapp.R.drawable.inter_continental_hotels;
import static com.example.android.torontotoursapp.R.drawable.omni_king_edward_hotels;
import static com.example.android.torontotoursapp.R.drawable.westin_harbor_hotels;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {
    public HotelsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        // create list of tourist attractions in toronto
        ArrayList<Toronto> hotelsList = new ArrayList<>();

        hotelsList.add(new Toronto(fairmont_hotels, "Fairmont Royal York", "100 Front St W, Toronto, ON M5J 1E3", "(416) 601-4707", "www.fairmont.com/royal-york-toronto", 5));
        hotelsList.add(new Toronto(omni_king_edward_hotels, "The Omni King Edward Hotel", "37 King St E, Toronto, ON M5C 1E9", "(416) 601-4707", "www.omnihotels.com/hotels/toronto-king-edward", 5));
        hotelsList.add(new Toronto(hilton_toronto, "Hilton Toronto", "145 Richmond St W, Toronto, ON M5H 2L2", "(416) 601-4707", "www.hilton.com/en/hotels/torhihh-hilton-toronto", 5));
        hotelsList.add(new Toronto(westin_harbor_hotels, "The Westin Harbour Castle, Toronto", "1 Harbour Square, Toronto, ON M5J 1A6", "(416) 601-4707", "www.marriott.com/hotels/travel/yyzwi-the-westin-harbour-castle-toronto", 5));
        hotelsList.add(new Toronto(inter_continental_hotels, "InterContinental Toronto Centre", "225 Front St W, Toronto, ON M5V 2X3", "(416) 601-4707", "www.fairmont.com/royal-york-toronto/", 5));

        HotelsAdapter hotelsAdapter = new HotelsAdapter(getActivity(), hotelsList);
        ListView hotelsListView = rootView.findViewById(R.id.hotels_list_view);
        hotelsListView.setAdapter(hotelsAdapter);

        // Attach tab layout to view pager
        //ViewPager2 viewPager = rootView.findViewById(R.id.pager);
        //TabLayout tabLayout = rootView.findViewById(R.id.tabs);
        //new TabLayoutMediator(tabLayout, viewPager,(tab, position) -> tab.setText("Hotels")).attach();

        return rootView;
    }
}