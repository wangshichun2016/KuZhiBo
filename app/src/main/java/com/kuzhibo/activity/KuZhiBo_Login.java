package com.kuzhibo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;

import cn.sharesdk.framework.ShareSDK;
import test.zhibo.com.kuzhibo.KuShiPin_ZhuActivity;
import test.zhibo.com.kuzhibo.R;

public class KuZhiBo_Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ku_zhi_bo__login);
//        SharedPreferences preferences = getSharedPreferences("qq_xinxi", MODE_PRIVATE);
//        String str_name = preferences.getString("my_qq_name", null);
//        String str_head = preferences.getString("my_qq_headimage", null);
//        if (str_name != null) {
//            Intent intent2 = new Intent(KuZhiBo_Login.this, KuShiPin_ZhuActivity.class);
//            startActivity(intent2);
//        }
        RadioButton qq_button = (RadioButton) findViewById(R.id.login_qq_button);
        RadioButton weixin_button = (RadioButton) findViewById(R.id.login_weixin_button);
        RadioButton weibo_button = (RadioButton) findViewById(R.id.login_weibo_button);
        ShareSDK.initSDK(this);
        qq_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KuZhiBo_Login.this, KuShiPin_ZhuActivity.class);
                startActivity(intent);
//                final Platform qq_login = ShareSDK.getPlatform(KuZhiBo_Login.this, QQ.NAME);
//                qq_login.authorize();
//                qq_login.setPlatformActionListener(new PlatformActionListener() {
//                    @Override
//                    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
//                        SharedPreferences.Editor editor = getSharedPreferences("qq_xinxi", MODE_PRIVATE).edit();
//                        String qq_name = qq_login.getDb().getUserName();
//                        String qq_title_image = qq_login.getDb().getUserIcon();
//                        editor.putString("my_qq_name", qq_name);
//                        editor.putString("my_qq_headimage", qq_title_image);
//                        Log.d("QQ+++++++++++++++++++++NAME", qq_name);
//                        editor.commit();
//                    }
//
//                    @Override
//                    public void onError(Platform platform, int i, Throwable throwable) {
//                        Log.d("QQ+++++++++++LOGIN", "连接失败,获取权限失败");
//                    }
//
//                    @Override
//                    public void onCancel(Platform platform, int i) {
//
//                    }
//                });

            }
        });
    }
}
