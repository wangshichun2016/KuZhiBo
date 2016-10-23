package com.kuzhibo.base;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/17.
 */

public abstract class BaseActivity extends Activity implements View.OnClickListener {

    //用来控制头部控件的显示
    public static final int BA_LETT_IMAGE = 0;
    public static final int BA_LEFT_TEXT = 1;
    public static final int BA_RIGHT_IMAGE = 2;
    public static final int BA_RIGHT_TEXT = 3;
    public static final int BA_LETI_IMAGE_RIGHT_IMAGE = 4;
    public static final int BA_LETI_IMAGE_RIGHT_TEXT = 5;
    public static final int BA_LEFT_TEXT_RIGHT_IMAGE = 6;
    public static final int BA_LEFT_TEXT_RIGHT_TEXT = 7;
    public static final int BA_RIGHT_IMAGE_TWO_IMAGE = 8;

    //头部控件
    private TextView tv_main_title_left_return;
    private TextView tv_main_title_textview;
    private TextView tv_main_title_setting;
    private ImageView iv_right_view;
    private ImageView iv_left_view;
    //左边返回按钮外层的布局
    private LinearLayout ll_left_layout;


    @Override
    public void onClick(View v) {

    }


    //写三个方法
    //1:初始化头部控件
    //2:初始化控件
    //3:设置监听


    //初始化头部控件的方法
    public abstract void initHeader();

    //查找控件的方法
    public abstract void initWidget();

    //设置状态的方法
    public abstract void setWidgetState();


    //初始化头部控件
    public void inittHeaderWidget() {


    }


    //左边的文字控件显示
    public void addBtnLeftListener(View.OnClickListener listener) {
    }

    //左边文字控件自定义文字内容
    public void addBtnLeftTextListener(View.OnClickListener listener, String title) {
    }

    //左边的图片控件显示
    public void addIMGLeftListener(View.OnClickListener listener) {
    }

    //左边控件自定义图片
    public void addIMGLeftBitmaplistener(View.OnClickListener listener, int id) {
    }

    //右边文字控件
    public void addBtnRightListener(View.OnClickListener listener) {
    }

    //右边文字控件自定义文字内容
    public void addBtnRightTextListener(View.OnClickListener listener, String title) {
    }


    //右边图片控件
    public void addIMGRightListener(View.OnClickListener listener) {
    }

    //右边图片控件自定义图片
    public void addIMGRightBitmapListener(View.OnClickListener listener, int id) {
    }


    public void setTitle(String title) {//设置中间文字的内容
    }


    //控制头部控件的显示与隐藏
    public void setTitleVisible(int staute) {
        switch (staute) {
            case 0://显示左边的图片返回键
                iv_left_view.setVisibility(View.VISIBLE);
                break;
            case 1://显示左边的文字返回键
                tv_main_title_setting.setVisibility(View.VISIBLE);
                break;
            case 2://显示右边的图片返回键
                iv_right_view.setVisibility(View.VISIBLE);
                break;
            case 3://显示右边的文字返回键
                tv_main_title_left_return.setVisibility(View.VISIBLE);
                break;
            case 4://显示左边的图片和右边的图片返回键
                iv_left_view.setVisibility(View.VISIBLE);
                iv_right_view.setVisibility(View.VISIBLE);
                break;
            case 5://显示左边的图片和右边的文字返回键
                iv_left_view.setVisibility(View.VISIBLE);
                tv_main_title_left_return.setVisibility(View.VISIBLE);
                break;
            case 6://显示左边的文字和右边的图片返回键
                iv_right_view.setVisibility(View.VISIBLE);
                tv_main_title_setting.setVisibility(View.VISIBLE);
                break;
            case 7://显示左边的文字和右边的文字返回键
                tv_main_title_setting.setVisibility(View.VISIBLE);
                tv_main_title_left_return.setVisibility(View.VISIBLE);

        }
    }


}
