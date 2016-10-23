package com.kuzhibo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import org.xutils.x;

import java.util.HashMap;
import java.util.Map;

import com.kuzhibo.bean.find.Bean3;
import com.kuzhibo.applocation.Find_myHttpUtiles;
import com.kuzhibo.adapter.Find_fragment_listitem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import test.zhibo.com.kuzhibo.R;


public class Find_fragment extends Fragment {

    private PullToRefreshScrollView ptrf;
    private GridView gv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment3, null);
        ptrf = (PullToRefreshScrollView) view.findViewById(R.id.ptrf_fragment3_ptrf);
        gv = (GridView) view.findViewById(R.id.fragment3_gridview);
        // 这几个刷新Label的设置
        ptrf.getLoadingLayoutProxy().setPullLabel("下拉刷新");
        ptrf.getLoadingLayoutProxy().setRefreshingLabel("正在刷新");
        ptrf.getLoadingLayoutProxy().setReleaseLabel("释放开始刷新");
        // 上拉、下拉设定
        ptrf.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        x.view().inject(getActivity());
        //viewpager数据
        Map<String, String> m3 = new HashMap<>();
        m3.put("mm", "bignox+VPhone+4.4.2");
        m3.put("token", "1a8f8b729bcc3e8839117d4dd068c0a0");
        m3.put("uid", "300091570");
        m3.put("version_code", "8");
        m3.put("deviceSystemName", "android");
        Retrofit retrofit4 = new Retrofit.Builder().baseUrl("http://m.1aka.tv/").addConverterFactory(GsonConverterFactory.create()).build();
        Find_myHttpUtiles utiles4 = retrofit4.create(Find_myHttpUtiles.class);
        Call<Bean3> http3 = utiles4.gethttp(m3);
        http3.enqueue(new Callback<Bean3>() {
            @Override
            public void onResponse(Call<Bean3> call, Response<Bean3> response) {
                Bean3 bean3 = response.body();
                Find_fragment_listitem fragment3_xl3 = new Find_fragment_listitem(bean3.data.new_room, getActivity());
                gv.setAdapter(fragment3_xl3);
            }

            @Override
            public void onFailure(Call<Bean3> call, Throwable t) {
                System.out.println("请求失败!!!");
            }
        });

        return view;
    }

}
