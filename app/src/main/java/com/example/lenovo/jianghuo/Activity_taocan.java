package com.example.lenovo.jianghuo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.lenovo.jianghuo.fragment.fiveFragment;
import com.example.lenovo.jianghuo.fragment.fourFragment;
import com.example.lenovo.jianghuo.fragment.fristFragment;
import com.example.lenovo.jianghuo.fragment.sixFragment;
import com.example.lenovo.jianghuo.fragment.threeFragment;
import com.example.lenovo.jianghuo.fragment.twoFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2017/6/22.
 */

public class Activity_taocan extends AppCompatActivity {
    public fristFragment fristFragment;
    public twoFragment twoFragment;

    public threeFragment threeFragment;
    public fourFragment fourFragment;
    public fiveFragment fiveFragment;
    public sixFragment sixFragment;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.taocan_activity_toolbar)
    Toolbar taocanActivityToolbar;

    private ArrayList<Fragment> fragmentList;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taocanshow);
        ButterKnife.bind(this);

        setSupportActionBar(taocanActivityToolbar);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

        fragmentList = new ArrayList<>();
        fristFragment = new fristFragment();
        twoFragment = new twoFragment();
        threeFragment = new threeFragment();
        fourFragment = new fourFragment();
        fiveFragment = new fiveFragment();
        sixFragment = new sixFragment();
        fragmentList.add(fristFragment);
        fragmentList.add(threeFragment);
        fragmentList.add(fiveFragment);
        fragmentList.add(twoFragment);
        fragmentList.add(fourFragment);
        fragmentList.add(sixFragment);
        viewpager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
        viewpager.setPageMargin(80);
        viewpager.setOffscreenPageLimit(6);
    }

    public class MyViewPagerAdapter extends FragmentPagerAdapter {
        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
            // TODO Auto-generated constructor stub
        }

        @Override
        public Fragment getItem(int arg0) {
            return fragmentList.get(arg0);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // TODO Auto-generated method stub
            return null;
        }


    }

}




