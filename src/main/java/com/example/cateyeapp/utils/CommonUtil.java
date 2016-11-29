package com.example.cateyeapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.ContextMenu;

/**
 * Created by Administrator on 2016/11/29.
 *通用的工具类
 */

public class CommonUtil {
    /**
     * 检查是否有网络
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context){
        NetworkInfo info = getNetworkInfo(context);

        return info !=null && info.isAvailable();
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }
}
