package com.kuzhibo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import com.kuzhibo.bean.hot.Date;

import test.zhibo.com.kuzhibo.R;

/**
 * Created by Administrator on 2016/10/11.
 */

public class Hot_fragment_listitem extends BaseAdapter {
    private List<Date> lists;
    private Context context;

    public Hot_fragment_listitem(List<Date> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    public void list_notify() {

    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
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
            convertView = View.inflate(context, R.layout.fragment2_listitem_item, null);
            holder.imageView1 = (ImageView) convertView.findViewById(R.id.iv_fragment2item_image1);
            holder.tv1 = (TextView) convertView.findViewById(R.id.tv_fragment2item_name);
            holder.tv2 = (TextView) convertView.findViewById(R.id.tv_fragment2item_qianming);
            holder.tv3 = (TextView) convertView.findViewById(R.id.tv_fragment2item_vip2);
            holder.tv4 = (TextView) convertView.findViewById(R.id.tv_fragment2item_rennum);
            holder.imageView2 = (ImageView) convertView.findViewById(R.id.iv_fragment2item_image2);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(lists.get(position).appface, holder.imageView1);
        holder.tv1.setText(lists.get(position).nickname);
        holder.tv2.setText(lists.get(position).roomname);
        holder.tv3.setText("V." + lists.get(position).level);
        holder.tv4.setText(lists.get(position).view_num + "");
        ImageLoader.getInstance().displayImage(lists.get(position).roombg, holder.imageView2);
        return convertView;
    }

    class ViewHolder {
        ImageView imageView1;
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        ImageView imageView2;
    }
}
