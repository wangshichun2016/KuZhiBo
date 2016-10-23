package com.kuzhibo.bean.hot;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Date {
    public String appface;
    public String create_time;
    public int level;
    public String live_timeline;
    public String nickname;
    public String region;
    public String roombg;
    public String roomname;
    public String pull_stream;
    public String share_addr;
    public String view_num;

    public String getAppface() {
        return appface;
    }

    public String getCreate_time() {
        return create_time;
    }

    public int getLevel() {
        return level;
    }

    public String getLive_timeline() {
        return live_timeline;
    }

    public String getNickname() {
        return nickname;
    }

    public String getRegion() {
        return region;
    }

    public String getRoombg() {
        return roombg;
    }

    public String getRoomname() {
        return roomname;
    }

    public String getPull_stream() {
        return pull_stream;
    }

    public String getShare_addr() {
        return share_addr;
    }

    public String getView_num() {
        return view_num;
    }

    @Override
    public String toString() {
        return "Date{" +
                "appface='" + appface + '\'' +
                ", create_time='" + create_time + '\'' +
                ", level=" + level +
                ", live_timeline='" + live_timeline + '\'' +
                ", nickname='" + nickname + '\'' +
                ", region='" + region + '\'' +
                ", roombg='" + roombg + '\'' +
                ", roomname='" + roomname + '\'' +
                ", pull_stream='" + pull_stream + '\'' +
                ", share_addr='" + share_addr + '\'' +
                ", view_num='" + view_num + '\'' +
                '}';
    }
}
