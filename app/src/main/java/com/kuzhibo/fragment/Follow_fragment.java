package com.kuzhibo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.kuzhibo.applocation.Hot_HttpUtiles;
import com.kuzhibo.adapter.Hot_fragment_listitem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.kuzhibo.activity.KuZhiBo_Player;

import test.zhibo.com.kuzhibo.R;


public class Follow_fragment extends Fragment {
    private PullToRefreshScrollView pullto;
    private ListView xl1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment1, null);
        pullto = (PullToRefreshScrollView) view.findViewById(R.id.ptrf_fragment1_ptrf);
        xl1 = (ListView) view.findViewById(R.id.xlv_fragment1_xlistview);
        // 这几个刷新Label的设置
        pullto.getLoadingLayoutProxy().setPullLabel("下拉刷新");
        pullto.getLoadingLayoutProxy().setRefreshingLabel("正在刷新");
        pullto.getLoadingLayoutProxy().setReleaseLabel("释放开始刷新");
        // 上拉、下拉设定
        pullto.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        x.view().inject(getActivity());
        //        //视频列表
        Map<String, String> m = new HashMap<>();
        m.put("mm", "bignox+VPhone+4.4.2");
        m.put("token", "1a8f8b729bcc3e8839117d4dd068c0a0");
        m.put("uid", "300091570");
        m.put("version_code", "8");
        m.put("deviceSystemName", "android");
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://m.1aka.tv/").addConverterFactory(GsonConverterFactory.create()).build();
        Hot_HttpUtiles utiles3 = retrofit.create(Hot_HttpUtiles.class);
        Call<Bean> http = utiles3.gethttp(m);
        http.enqueue(new Callback<Bean>() {

            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                final Bean bean = response.body();
                Hot_fragment_listitem xl2s = new Hot_fragment_listitem(bean.data.list, getActivity());
                xl1.setAdapter(xl2s);
                xl1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
