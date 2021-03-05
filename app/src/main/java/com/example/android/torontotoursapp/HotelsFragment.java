package com.example.android.torontotoursapp;

import android.content.res.Resources;
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

        int[] imageId = {fairmont_hotels, omni_king_edward_hotels, hilton_toronto, westin_harbor_hotels, inter_continental_hotels};
        double[] ratings = {5, 5, 5, 5, 5};

        Resources res = getResources();
        String[] names = res.getStringArray(R.array.hotel_names);
        String[] address = res.getStringArray(R.array.hotel_address);
        String[] phones = res.getStringArray(R.array.hotel_phone_numbers);
        String[] websites = res.getStringArray(R.array.hotel_website);

        //add restaurants to restaurant list
        for(int i = 0; i < imageId.length; i++){
            hotelsList.add(new Toronto(imageId[i], names[i], address[i], phones[i], websites[i], ratings[i]));
        }

        HotelsAdapter hotelsAdapter = new HotelsAdapter(getActivity(), hotelsList);
        ListView hotelsListView = rootView.findViewById(R.id.hotels_list_view);
        hotelsListView.setAdapter(hotelsAdapter);

        return rootView;
    }
}