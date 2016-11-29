package com.example.cateyeapp;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Administrator on 2016/11/28.
 */

public class CateeyeApp extends Application{

    public static CateeyeApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        init();

    }

    private void init() {
        //初始化Stetro调试工具
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}
