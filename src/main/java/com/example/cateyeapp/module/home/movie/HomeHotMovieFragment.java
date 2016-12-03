package com.example.cateyeapp.module.home.movie;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.cateyeapp.R;
import com.example.cateyeapp.adapter.HotMovieAdapter;
import com.example.cateyeapp.base.RxLazyFragment;
import com.example.cateyeapp.entity.MovieInfo;
import com.example.cateyeapp.network.RetrofitHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/11/30.
 */

public class HomeHotMovieFragment extends RxLazyFragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;
    private boolean mIsRefreshing = false;
    private HotMovieAdapter adapter;
    private List<MovieInfo.DataBean.MoviesBean> hotMovies= new ArrayList<>();

    public static HomeHotMovieFragment newInstance(){
        return  new HomeHotMovieFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragmetnt_home_hot_movie;
    }

    @Override
    public void finishCreateView(Bundle state) {
        isPrepared = true;
        lazyLoad();

    }

    @Override
    protected void lazyLoad() {

        if(!isPrepared || !isVisible){
            return;
        }
        initRefreshLayout();
        initRecyclerView();
        isPrepared = false;
    }

    @Override
    protected void initRefreshLayout() {
        swipeLayout.setColorSchemeResources(R.color.colorPrimary);
        swipeLayout.post(() -> {
            swipeLayout.setRefreshing(true);
            mIsRefreshing = true;
           loadData();
        });
        swipeLayout.setOnRefreshListener(() -> {
            clearData();
            loadData();
        });
    }

    private void clearData() {
        mIsRefreshing = true;
    }

    @Override
    protected void initRecyclerView() {
         adapter = new HotMovieAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void loadData() {
        unSubcription();
        subscription = RetrofitHelper.getHotMovieApi()
                .getMovieList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MovieInfo>() {
                    @Override
                    public void call(MovieInfo movieInfo) {
                        Toast.makeText(getApplicationContext(),"jajajja",Toast.LENGTH_SHORT).show();
                        hotMovies.addAll(movieInfo.getData().getMovies());
                        finishTask();
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Toast.makeText(getApplicationContext(),"Throwable",Toast.LENGTH_SHORT).show();
                        swipeLayout.setRefreshing(false);
                    }
                });

    }

    @Override
    protected void finishTask() {
        swipeLayout.setRefreshing(false);
        adapter.setMovieBean(hotMovies);
    }

}
