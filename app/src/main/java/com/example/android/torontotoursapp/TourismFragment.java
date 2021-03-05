package com.example.android.torontotoursapp;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        int[] imageId = {cn_tower_tourism, rom_tourism, casa_loma, ripleys_aquarium_tourism, wonderland_tourism};
        double[] ratings = {4.6, 4.7, 4.6, 4.6, 4.5};

        Resources res = getResources();
        String[] names = res.getStringArray(R.array.tourism_names);
        String[] address = res.getStringArray(R.array.tourism_address);
        String[] phones = res.getStringArray(R.array.tourism_phone_numbers);
        String[] websites = res.getStringArray(R.array.tourism_website);

        for(int i = 0; i < imageId.length; i++){
            tourismList.add(new Toronto(imageId[i], names[i], address[i], phones[i], websites[i], ratings[i]));
        }

        TourismAdapter tourismAdapter = new TourismAdapter(getActivity(), tourismList);
        ListView tourismListView = rootView.findViewById(R.id.tourism_list_view);
        tourismListView.setAdapter(tourismAdapter);

        return rootView;

    }
}