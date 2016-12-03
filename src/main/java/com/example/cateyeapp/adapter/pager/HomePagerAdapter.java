package com.example.cateyeapp.adapter.pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cateyeapp.R;
import com.example.cateyeapp.module.home.movie.HomeHotMovieFragment;
import com.example.cateyeapp.module.home.movie.HomeWaitMovieFragment;

/**
 * Created by Administrator on 2016/11/30.
 */

public class HomePagerAdapter extends FragmentPagerAdapter{

    private final String[] TITLES;

    private Fragment[] fragments;

    public HomePagerAdapter(FragmentManager fm,Context context) {
        super(fm);
       TITLES = context.getResources().getStringArray(R.array.sections);
        fragments = new Fragment[TITLES.length];


    }

    @Override
    public Fragment getItem(int position) {
        Fragment a = fragments[position];
        if(a == null){
            switch (position){
                case 0:
                    fragments[position] = HomeHotMovieFragment.newInstance();

                    break;
                case 1:
                    fragments[position] = HomeWaitMovieFragment.newInstance();
                    break;
                case 2:
                    fragments[position] = new Fragment();
                    break;
                default:
                    break;
            }
        }
        return fragments[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
