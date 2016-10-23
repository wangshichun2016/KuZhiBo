package com.kuzhibo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

import test.zhibo.com.kuzhibo.KuZhiBo_Login;
import test.zhibo.com.kuzhibo.R;

public class MainActivity extends Activity {
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                Intent intent = new Intent(MainActivity.this, KuShiPin_ZhuActivity.class);
//                startActivity(intent);
                Intent intent = new Intent(MainActivity.this, KuZhiBo_Login.class);
                startActivity(intent);
            }
        }, 2000);
    }

}
