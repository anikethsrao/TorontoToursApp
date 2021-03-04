package com.example.android.torontotoursapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FragmentManager fm = getSupportFragmentManager();
        // add fragment
        //FragmentTransaction ft = fm.beginTransaction();
        // restaurant fragment
        // ft.add(R.id.frame_main, new RestaurantFragment(), null);

        // Instantiate View Pager
        ViewPager2 viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new ScreenSlideAdapter(getSupportFragmentManager(), getLifecycle()));

    }
}