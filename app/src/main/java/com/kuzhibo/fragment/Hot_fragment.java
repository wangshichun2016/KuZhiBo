package com.kuzhibo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import org.xutils.x;

import java.util.HashMap;
import java.util.Map;

import com.kuzhibo.bean.hot.Bean;
import com.kuzhibo.bean.hot.Bean2;
import com.kuzhibo.applocation.Hot_myHttpUtiles;
import com.kuzhibo.applocation.Hot_viewpager_myHttpUtiles;
import com.kuzhibo.adapter.Hot_fragment_listitem_viewpager;
import com.kuzhibo.adapter.Hot_fragment_listitem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.kuzhibo.activity.KuZhiBo_Player;

import test.zhibo.com.kuzhibo.R;


public class Hot_fragment extends Fragment {
    private ListView xl2;
    private PullToRefreshScrollView pullto;
    private ViewPager vp;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment2, null);
        pullto = (PullToRefreshScrollView) view.findViewById(R.id.ptrf_fragment2_ptrf);
        vp = (ViewPager) view.findViewById(R.id.vp_fragment2_vp);
        xl2 = (ListView) view.findViewById(R.id.xlv_fragment2_xlistview);
        // 这几个刷新Label的设置
        pullto.getLoadingLayoutProxy().setPullLabel("下拉刷新");
        pullto.getLoadingLayoutProxy().setRefreshingLabel("正在刷新");
        pullto.getLoadingLayoutProxy().setReleaseLabel("释放开始刷新");
        // 上拉、下拉设定
        pullto.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        x.view().inject(getActivity());
        //viewpager数据
        Map<String, String> m2 = new HashMap<>();
        m2.put("mm", "bignox+VPhone+4.4.2");
        m2.put("token", "1a8f8b729bcc3e8839117d4dd068c0a0");
        m2.put("uid", "300091570");
        m2.put("version_code", "8");
        m2.put("deviceSystemName", "android");
        Retrofit retrofit2 = new Retrofit.Builder().baseUrl("http://m.1aka.tv/").addConverterFactory(GsonConverterFactory.create()).build();
        Hot_viewpager_myHttpUtiles utiles2 = retrofit2.create(Hot_viewpager_myHttpUtiles.class);
        Call<Bean2> http2 = utiles2.gethttp(m2);
        http2.enqueue(new Callback<Bean2>() {
            @Override
            public void onResponse(Call<Bean2> call, Response<Bean2> response) {
                Bean2 bean2 = response.body();
                Hot_fragment_listitem_viewpager list_vp = new Hot_fragment_listitem_viewpager(bean2.data, getActivity());
                vp.setAdapter(list_vp);
            }

            @Override
            public void onFailure(Call<Bean2> call, Throwable t) {
                System.out.println("请求失败!!!");
            }
        });
//        //视频列表
        Map<String, String> m = new HashMap<>();
        m.put("mm", "bignox+VPhone+4.4.2");
        m.put("token", "1a8f8b729bcc3e8839117d4dd068c0a0");
        m.put("uid", "300091570");
        m.put("version_code", "8");
        m.put("deviceSystemName", "android");
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://m.1aka.tv/").addConverterFactory(GsonConverterFactory.create()).build();
        Hot_myHttpUtiles utiles = retrofit.create(Hot_myHttpUtiles.class);
        Call<Bean> http = utiles.gethttp(m);
        http.enqueue(new Callback<Bean>() {


            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                final Bean bean = response.body();
                Log.d("bbbbbbbbbbbbbbbbbb", bean.data.list.toString());
                Hot_fragment_listitem xl2s = new Hot_fragment_listitem(bean.data.list, getActivity());
                xl2.setAdapter(xl2s);
                xl2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intents = new Intent(getActivity(), KuZhiBo_Player.class);
                        intents.putExtra("url", bean.data.list.get(position).pull_stream);
                        getActivity().startActivity(intents);
                    }
                });

            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                System.out.println("请求失败!!!");
            }
        });
        return view;
    }

}
