package com.hly;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/3/5~~~~~~
 * ~~~~~~更改时间:2019/3/5~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppFrontBackHelper helper = new AppFrontBackHelper();
        helper.register(MyApplication.this, new AppFrontBackHelper.OnAppStatusListener() {
            @Override
            public void onFront() {
                //应用切到前台处理
            }
            @Override
            public void onBack() {
                //应用切到后台处理
                Toast.makeText(MyApplication.this, "应用切换到后台", Toast.LENGTH_SHORT).show();
                Log.d("=========hly=========","切换到后太");
            }
        });
    }


}
