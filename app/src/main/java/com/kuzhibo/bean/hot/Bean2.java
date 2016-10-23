package com.kuzhibo.bean.hot;

import java.util.List;

import com_KuZhiBo_bean2.Data2;

/**
 * Created by Administrator on 2016/10/11.
 */

public class Bean2 {
    public List<Data2> data;

    public List<Data2> getData() {
        return data;
    }

    public void setData(List<Data2> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "data=" + data +
                '}';
    }
}
