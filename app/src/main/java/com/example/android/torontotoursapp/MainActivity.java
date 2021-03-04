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
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private String[] tabTitles = {"Restaurants", "Tourism", "Events", "Hotels"};

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate View Pager
        ViewPager2 viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new ScreenSlideAdapter(getSupportFragmentManager(), getLifecycle()));

        // Instantiate and link to tabLayout to viewpager
        TabLayout tabLayout = findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> tab.setText(tabTitles[position]))).attach();
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

}