package com.zzy.subprocessmodule;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zzy.flysp.core.spHelper.SPHelper;

/**
 * @author zzy
 * @date 2018/9/18
 */

public class TestActivity extends Activity {
    private static final String TAG = "TestActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = SPHelper.getString("name","");
        Log.e(TAG,"name:"+name);
    }


}
