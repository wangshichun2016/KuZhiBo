package com.kuzhibo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import test.zhibo.com.kuzhibo.R;

public class KuZhiBo_SouSuo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ku_zhi_bo__sou_suo);

    }
}
