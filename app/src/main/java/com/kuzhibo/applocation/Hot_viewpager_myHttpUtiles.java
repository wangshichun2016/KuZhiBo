package com.kuzhibo.applocation;

import java.util.Map;

import com.kuzhibo.bean.hot.Bean2;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/10/10.
 */

public interface Hot_viewpager_myHttpUtiles {
    @FormUrlEncoded
    @POST("home/banner")
    Call<Bean2> gethttp(@FieldMap Map<String, String> m);

}
