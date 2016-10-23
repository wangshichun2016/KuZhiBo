package com.kuzhibo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kuzhibo.fragment.Fragment1;
import com.kuzhibo.fragment.Fragment2;
import com.kuzhibo.fragment.Fragment3;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Homepage_zhuActivity_psl extends FragmentPagerAdapter {
    private String[] str = {"关注", "热门", "发现"};

    public Homepage_zhuActivity_psl(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                Fragment1 fragment1 = new Fragment1();
                fragment = fragment1;
                return fragment;
            case 1:
                Fragment2 fragment2 = new Fragment2();
                fragment = fragment2;
                return fragment;
            case 2:
                Fragment3 fragment3 = new Fragment3();
                fragment = fragment3;
                return fragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return str.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
