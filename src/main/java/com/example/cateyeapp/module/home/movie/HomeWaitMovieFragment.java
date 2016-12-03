package com.example.cateyeapp.module.home.movie;

import android.os.Bundle;

import com.example.cateyeapp.R;
import com.example.cateyeapp.base.RxLazyFragment;

/**
 * Created by Administrator on 2016/12/3.
 */

public class HomeWaitMovieFragment extends RxLazyFragment {

    public static HomeWaitMovieFragment newInstance(){
        return new HomeWaitMovieFragment();
    }
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home_wait_movie;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
