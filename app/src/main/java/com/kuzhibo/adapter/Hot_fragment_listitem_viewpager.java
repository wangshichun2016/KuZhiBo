package com.kuzhibo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import com.kuzhibo.bean.hot.Data2;
import test.zhibo.com.kuzhibo.R;

/**
 * Created by Administrator on 2016/10/11.
 */

public class Hot_fragment_listitem_viewpager extends PagerAdapter {
    private List<Data2> list;
    private Context context;

    public Hot_fragment_listitem_viewpager(List<Data2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v2 = View.inflate(context, R.layout.fragment2_listitem_viewpager, null);
        ImageView image2 = (ImageView) v2.findViewById(R.id.vp_fragment2listitemviewpager_vp);
        for (int i = 0; i < list.size(); i++) {
            ImageLoader.getInstance().displayImage(list.get(position).img_url, image2);
        }
        container.addView(v2);
        return v2;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
