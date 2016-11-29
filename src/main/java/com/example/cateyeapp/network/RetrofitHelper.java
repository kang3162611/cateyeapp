package com.example.cateyeapp.network;

import com.example.cateyeapp.CateeyeApp;
import com.example.cateyeapp.utils.CommonUtil;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2016/11/28.
 *
 */

public class RetrofitHelper {

    private static  OkHttpClient okHttpClient ;

    private static final String API_BASE_URL = "http://m.maoyan.com/";


    static{
      initOKHttpClient();
        }


    /**
     * 初始化OKHttpClient,设置缓存,设置超时时间,设置打印日志,设置UA拦截器
     */
    private static void initOKHttpClient() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if(okHttpClient == null){
            synchronized (RetrofitHelper.class){
                //设置Http缓存
                Cache cache = new Cache(new File(CateeyeApp.mInstance.getCacheDir(),"HttpCache"),1024 * 1024 * 10);

                if (okHttpClient == null){
                    okHttpClient = new OkHttpClient.Builder()
                            .cache(cache)
                            .addInterceptor(httpLoggingInterceptor)
                            .addNetworkInterceptor(new StethoInterceptor())
                            .addNetworkInterceptor(new CacheInterceptor())
                            .retryOnConnectionFailure(true)
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .writeTimeout(20, TimeUnit.SECONDS)
                            .readTimeout(20,TimeUnit.SECONDS)
//                            .interceptors() //设置UA拦截暂时不需要
                            .build();
                }
            }
    }


}

    private static class CacheInterceptor implements Interceptor{
        @Override
        public Response intercept(Chain chain) throws IOException {

            // 有网络时 设置缓存超时时间1个小时
            int maxAge = 60 * 60;
            // 无网络时，设置超时为1天
            int maxStale = 60 * 60 * 24;

            Request request = chain.request();
            if(CommonUtil.isNetworkAvailable(CateeyeApp.mInstance)){
                //如果有网络从网络获取
                request.newBuilder()
                        .cacheControl(CacheControl.FORCE_NETWORK)
                        .build();
            }else {
                //无网络时只从缓存中读取
                request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }

            Response response = chain.proceed(request);
            if(CommonUtil.isNetworkAvailable(CateeyeApp.mInstance)){

                response = response.newBuilder()
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .build();
            }else{
                response = response.newBuilder()
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .build();
            }


            return response;
        }
    }
}
