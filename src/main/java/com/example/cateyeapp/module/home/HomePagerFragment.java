package com.example.cateyeapp.module.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.example.cateyeapp.R;
import com.example.cateyeapp.adapter.pager.HomePagerAdapter;
import com.example.cateyeapp.base.RxLazyFragment;
import com.example.cateyeapp.module.commum.MainActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/11/30.
 */

public class HomePagerFragment extends RxLazyFragment {


    @BindView(R.id.toolBar)
    Toolbar mTooBar;
    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    public static HomePagerFragment newInstance() {

        return new HomePagerFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_pager;
    }

    @Override
    public void finishCreateView(Bundle state) {
        initToolBar();

        initViewPager();

    }

    /**
     * 初始化
     */
    private void initViewPager() {
        HomePagerAdapter adapter = new HomePagerAdapter(getChildFragmentManager(),getApplicationContext());
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(0);
    }

    private void initToolBar() {
        mTooBar.setTitle("");
        ((MainActivity)getActivity()).setSupportActionBar(mTooBar);
    }

}
