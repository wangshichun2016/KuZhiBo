package com.kuzhibo.bean.find;

import java.util.List;

import com_KuZhiBo_Bean3.Room;

/**
 * Created by Administrator on 2016/10/13.
 */

public class Data3 {
    public List<Room> new_room;

    public List<Room> getNew_room() {
        return new_room;
    }

    public void setNew_room(List<Room> new_room) {
        this.new_room = new_room;
    }

    @Override
    public String toString() {
        return "Data3{" +
                "new_room=" + new_room +
                '}';
    }
}
