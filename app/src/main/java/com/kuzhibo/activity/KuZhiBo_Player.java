package com.kuzhibo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import com.baidu.cyberplayer.core.BVideoView;

import test.zhibo.com.kuzhibo.R;


public class KuZhiBo_Player extends Activity {

    private String AK = "ef234d3bce3e4551a35667d0f4b4177c";
    private BVideoView baidu_vadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ku_zhi_bo__player);
        baidu_vadio = (BVideoView) findViewById(R.id.baidu_vadio);
        String url = getIntent().getStringExtra("url");
        Log.d("7777777777777777777777777", url + "98+163952362509525255+2+");
        BVideoView.setAK(AK);
        baidu_vadio.setVideoPath(url);
        baidu_vadio.start();
        int num = baidu_vadio.getCurrentPosition();
        int max_time = baidu_vadio.getDuration();
        if (baidu_vadio.isPlaying()) {
            if (num == max_time) {
                finish();
                baidu_vadio.pause();
                baidu_vadio.stopPlayback();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (baidu_vadio.isPlaying()) {
            baidu_vadio.pause();
            baidu_vadio.stopPlayback();
        }

    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (baidu_vadio.isPlaying()) {
//            baidu_vadio.pause();
//            baidu_vadio.stopPlayback();
//        }
//    }
    //    @Override
//    protected void onDestroy() {
//        baidu_vadio.stopPlayback();
//    }
}


