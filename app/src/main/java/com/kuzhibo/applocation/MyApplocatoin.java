package com.kuzhibo.applocation;

import android.app.Application;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.xutils.x;

import test.zhibo.com.kuzhibo.R;


/**
 * Created by Administrator on 2016/10
 * /10.
 */

public class MyApplocatoin extends Application {
    @Override
    public void onCreate() {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheOnDisk(true).cacheInMemory(true)
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher).build();
        int maxSize = (int) (Runtime.getRuntime().maxMemory() / 8);
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .discCache(new UnlimitedDiskCache(getCacheDir()))
                .memoryCache(new UsingFreqLimitedMemoryCache(maxSize))
                .threadPoolSize(3).threadPriority(Thread.NORM_PRIORITY - 1)
                .defaultDisplayImageOptions(options).build();
        ImageLoader.getInstance().init(configuration);
        x.Ext.init(this);
    }

}
