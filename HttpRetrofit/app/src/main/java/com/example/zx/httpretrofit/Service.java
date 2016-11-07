package com.example.zx.httpretrofit;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by zx on 16-9-23.
 */
public interface Service {
    //@POST("mobileLogin/submit.html")
    //  Call<String> getString(@Query("loginname") String loginname,
    //                       @Query("nloginpwd") String nloginpwd);\
    @POST("login?alias=&redir=https%3A%2F%2Fwww.douban.com%2F&source=index_nav&error=1001")
    Call<String> getUser(@Query("name") String name,@Query("passwd") String passwd);
}
