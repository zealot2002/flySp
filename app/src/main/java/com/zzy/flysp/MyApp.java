package com.zzy.flysp;

import android.app.Application;

import com.zzy.flysp.core.spHelper.SPHelper;

/**
 * @author zzy
 * @date 2018/9/18
 */

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SPHelper.init(this);
    }
}
