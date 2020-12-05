package com.example.androidview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.androidview.fragment.BlankFragment;
import com.example.androidview.fragment.BlankFragment2;
import com.example.androidview.fragment.BlankFragment3;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> list=new ArrayList<>();
    private VpAdapter vpAdapter=new VpAdapter(list);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewp);
        TabLayout tabLayout=findViewById(R.id.tab_layout);

        List<Fragment> fragments=new ArrayList<>();
        fragments.add(new BlankFragment());
        fragments.add(new BlankFragment2());
        fragments.add(new BlankFragment3());
        PagerAdapter adapter= new PagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        }
        public class PagerAdapter extends FragmentPagerAdapter {
            List<Fragment> fragments;
            public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
                super(fm);
                this.fragments = fragments;
            }

            @NonNull
            @Override
            public CharSequence getPageTitle(int position){
                if(position==0) return "简介";
                if(position==1) return "课程";
                if(position==2) return "其他";
                return "...";
            }
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
          }

}