package com.kuzhibo.applocation;

import java.util.Map;

import com.kuzhibo.bean.hot.Bean;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/10/10.
 */

public interface Hot_HttpUtiles {
    @FormUrlEncoded
    @POST("home/video_list")
    Call<Bean> gethttp(@FieldMap Map<String, String> m);

}
