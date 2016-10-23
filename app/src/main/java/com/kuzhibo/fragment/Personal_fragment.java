package com.kuzhibo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.zhibo.com.kuzhibo.R;

/**
 * Created by Administrator on 2016/10/8.
 */

public class Personal_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View zhu_view3 = View.inflate(getActivity(), R.layout.zhuactivity_fragment3, null);
        return zhu_view3;
    }
}
