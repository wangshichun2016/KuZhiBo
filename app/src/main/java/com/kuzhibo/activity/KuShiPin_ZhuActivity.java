package com.kuzhibo.activity;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import con_kuzhibo_fragment.ZhuActivity_Fragment1;
import con_kuzhibo_fragment.ZhuActivity_Fragment3;
import test.zhibo.com.kuzhibo.R;

public class KuShiPin_ZhuActivity extends FragmentActivity {
    private RadioGroup radioGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ku_shi_pin__zhu);
        radioGroup = (RadioGroup) findViewById(R.id.rg_zhuactivity_rg);
        rb1 = (RadioButton) findViewById(R.id.rb_zhuactivity_radiobutton1);
        rb2 = (RadioButton) findViewById(R.id.rb_zhuactivity_radiobutton2);
        rb3 = (RadioButton) findViewById(R.id.rb_zhuactivity_radiobutton3);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3.setChecked(false);
                ZhuActivity_Fragment1 fragment1 = new ZhuActivity_Fragment1();
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_zhuactivity_framelayout, fragment1).commit();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuShiPin_ZhuActivity.this, KuZhiBo_ZiPai.class);
                startActivity(intent);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(false);
                ZhuActivity_Fragment3 fragment3 = new ZhuActivity_Fragment3();
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_zhuactivity_framelayout, fragment3).commit();
            }
        });
    }
}
