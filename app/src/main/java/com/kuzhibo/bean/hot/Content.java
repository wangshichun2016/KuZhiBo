package com.kuzhibo.bean.hot;

import com.kuzhibo.bean.Date;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Content {
    public List<Date> list;

    public void setList(List<Date> list) {
        this.list = list;
    }

    public List<Date> getList() {

        return list;
    }

    @Override
    public String toString() {
        return "Content{" +
                "list=" + list +
                '}';
    }

}
