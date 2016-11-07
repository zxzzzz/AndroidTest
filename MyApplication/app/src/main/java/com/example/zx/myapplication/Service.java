package com.example.zx.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by zx on 16-9-23.
 */
public interface Service {
    //@POST("mobileLogin/submit.html")
    //  Call<String> getString(@Query("loginname") String loginname,
    //                       @Query("nloginpwd") String nloginpwd);\
    @GET("users/{username}")
    Call<GitModel> getSearchBooks(@Path("username") String username);
}
