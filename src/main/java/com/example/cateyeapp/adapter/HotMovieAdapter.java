package com.example.cateyeapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.cateyeapp.R;
import com.example.cateyeapp.entity.MovieInfo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/30.
 */

public class HotMovieAdapter extends RecyclerView.Adapter{

    private List<MovieInfo.DataBean.MoviesBean> movies;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_hot_movie_item,parent,false);
        return new HotMovieHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HotMovieHolder hotMovieHolder =(HotMovieHolder) holder;
        MovieInfo.DataBean.MoviesBean movieInfo = movies.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movieInfo.getImg())
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.vs)
                .dontAnimate()
                .into(hotMovieHolder.mMovieImg);
        hotMovieHolder.mNameTv.setText(movieInfo.getNm());
        hotMovieHolder.mScoreTv.setText(holder.itemView.getContext().getString(R.string.home_hot_movie_mush_watch_people,movieInfo.getWish()));
        hotMovieHolder.mDescribeTv.setText(movieInfo.getScm());
        hotMovieHolder.mMatchTv.setText(movieInfo.getShowInfo());
    }

    @Override
    public int getItemCount() {
        return movies == null ? 0 : movies.size();
    }
    public void setMovieBean(List<MovieInfo.DataBean.MoviesBean> movies){
        this.movies = movies;
        notifyDataSetChanged();
    }
    public class HotMovieHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.movie_img)
        ImageView mMovieImg;
        @BindView(R.id.describe_tv)
        TextView mDescribeTv;
        @BindView(R.id.match_tv)
        TextView mMatchTv;
        @BindView(R.id.name_tv)
        TextView mNameTv;
        @BindView(R.id.score_tv)
        TextView mScoreTv;
        public HotMovieHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
