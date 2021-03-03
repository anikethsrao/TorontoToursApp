package com.example.android.torontotoursapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get fragment manager
        FragmentManager fm = getSupportFragmentManager();
        // add fragment
        FragmentTransaction ft = fm.beginTransaction();

        //Only run one at a time
        // restaurant fragment
        // ft.add(R.id.frame_main, new RestaurantFragment(), null);
        // tourism fragment
        ft.add(R.id.frame_main, new TourismFragment(), null);

        ft.commit();

    }
}