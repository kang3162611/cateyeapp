package com.example.cateyeapp.network.api;

import com.example.cateyeapp.entity.MovieInfo;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/29.
 * 首页电影列表
 */

public interface HotMovieService {

    @GET("movie/list.json?type=hot&offset=0&limit=1000")
    Observable<MovieInfo> getMovieList();
}
