package com.kuzhibo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import com.kuzhibo.bean.find.Room;
import test.zhibo.com.kuzhibo.R;

/**
 * Created by Administrator on 2016/9/29.
 */

public class Find_fragment_listitem extends BaseAdapter {
    private List<Room> list;
    private Context context;

    public Find_fragment_listitem(List<Room> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.fragment3_list_item, null);
            holder.image4 = (ImageView) convertView.findViewById(R.id.fragment3_listitem_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(list.get(position).roombg, holder.image4);
        return convertView;
    }

    class ViewHolder {
        ImageView image4;
    }
}
