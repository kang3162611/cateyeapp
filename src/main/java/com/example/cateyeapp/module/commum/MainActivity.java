package com.example.cateyeapp.module.commum;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import com.example.cateyeapp.R;
import com.example.cateyeapp.base.RxBaseActivity;
import com.example.cateyeapp.module.home.HomePagerFragment;

public class MainActivity extends RxBaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //初始化fragment
        initFragment();

    }

    private void initFragment() {
        HomePagerFragment homePagerFragment = HomePagerFragment.newInstance();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.container,homePagerFragment)
                .show(homePagerFragment)
                .commit();

    }

    @Override
    public void initToolBar() {

    }
}
