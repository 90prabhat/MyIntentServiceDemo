package com.example.prabhat.myintentservicedemo;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService2 extends IntentService {
    public MyService2() {
        super("");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        System.out.println("thread is working......");
    }
}
