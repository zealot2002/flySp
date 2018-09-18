package com.zzy.flysp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.zzy.core.spHelper.SPHelper;
import com.zzy.subprocessmodule.TestActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SPHelper.save("name","zzyzzz");

        Intent it = new Intent(this, TestActivity.class);
        startActivity(it);
    }
}
