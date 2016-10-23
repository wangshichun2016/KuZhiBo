package com.kuzhibo.bean.hot;

import com.kuzhibo.bean.Content;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Bean {
    public Content data;

    public Content getData() {
        return data;
    }

    public void setData(Content data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "data=" + data +
                '}';
    }
}
