package com.example.prabhat.myintentservicedemo;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends IntentService {
    public MyService() {
        super("palle thread");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
       //CURRENT THERE IS NOTHING TO WRITE-runs on worker thread-dont ui
        System.out.println("thread is working......");
    }
}
