package com.example.mytestapplication;

import android.app.Application;

import com.orhanobut.hawk.Hawk;

/**
 * Created by Harsh Rawat on 13-08-2019.
 * EV-Motors
 * harsh.rawat@ev-motors.com
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Hawk.init(this).build();
    }
}
