package com.example.cateyeapp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;


import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Subscription;

/**
 * Created by hcc on 16/8/7 21:18
 * 100332338@qq.com
 * <p/>
 * Activity基类
 */
public abstract class RxBaseActivity extends AppCompatActivity
{

    protected Subscription subscription;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        //设置布局内容
        setContentView(getLayoutId());
        //初始化黄油刀控件绑定框架
      bind = ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();
    }

    public abstract int getLayoutId();

    public abstract void initViews(Bundle savedInstanceState);

    public abstract void initToolBar();

    public void loadData() {}

    public void showProgressBar() {}

    public void hideProgressBar() {}

    public void initRecyclerView() {}

    public void initRefreshLayout() {}

    public void finishTask() {}


    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState)
    {

        super.onPostCreate(savedInstanceState);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP)
//        {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.setStatusBarColor(ThemeUtils.getColorById(this, R.color.theme_color_primary_dark));
//            ActivityManager.TaskDescription description = new ActivityManager.TaskDescription(null, null,
//                    ThemeUtils.getThemeAttrColor(this, android.R.attr.colorPrimary));
//            setTaskDescription(description);
//        }
    }

    @Override
    protected void onDestroy()
    {

        super.onDestroy();
        bind.unbind();
        unSubcription();
    }

    protected  void unSubcription(){
        if(subscription != null && subscription.isUnsubscribed()){
            subscription.unsubscribe();
        }
    };
}
