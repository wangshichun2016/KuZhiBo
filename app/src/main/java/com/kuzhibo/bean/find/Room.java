package com.kuzhibo.bean.find;

/**
 * Created by Administrator on 2016/10/13.
 */

public class Room {
    public String appface;
    public String nickname;
    public String roombg;
    public String share_addr;

    public String getAppface() {
        return appface;
    }

    public String getShare_addr() {
        return share_addr;
    }

    public String getRoombg() {
        return roombg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setShare_addr(String share_addr) {
        this.share_addr = share_addr;
    }

    public void setRoombg(String roombg) {
        this.roombg = roombg;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAppface(String appface) {
        this.appface = appface;
    }

    @Override
    public String toString() {
        return "Room{" +
                "appface='" + appface + '\'' +
                ", nickname='" + nickname + '\'' +
                ", roombg='" + roombg + '\'' +
                ", share_addr='" + share_addr + '\'' +
                '}';
    }
}
