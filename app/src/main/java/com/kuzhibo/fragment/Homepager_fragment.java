package com.kuzhibo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.astuetz.PagerSlidingTabStrip;

import com.kuzhibo.adapter.Homepage_zhuActivity_psl;
import com.kuzhibo.activity.KuZhiBo_SouSuo;
import test.zhibo.com.kuzhibo.R;

/**
 * Created by Administrator on 2016/10/8.
 */

public class Homepager_fragment extends Fragment {
    private String url = "http://live.jufan.tv/cgi/hall/get?sign=3A628E9F81CAD1A3A7DC8B9DC027F2744121BAEB&r=qknbtddzd&page=0&type=new&userid=500056507";
    private PagerSlidingTabStrip psl;
    private RadioButton rb_sousuo;
    private ViewPager vp;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View zhu_view1 = View.inflate(getActivity(), R.layout.zhuactivity_fragment1, null);
        psl = (PagerSlidingTabStrip) zhu_view1.findViewById(R.id.zhuactivity_PagerSlidingTabStrip);
        rb_sousuo = (RadioButton) zhu_view1.findViewById(R.id.rb_zhuactivity_sousuoimage);
        vp = (ViewPager) zhu_view1.findViewById(R.id.vp_zhuactivity_viewpager);
        Homepage_zhuActivity_psl zhuActivity_psl = new Homepage_zhuActivity_psl(getActivity().getSupportFragmentManager());
        vp.setAdapter(zhuActivity_psl);
        psl.setViewPager(vp);
        rb_sousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KuZhiBo_SouSuo.class);
                startActivity(intent);
            }
        });
        return zhu_view1;
    }
}
