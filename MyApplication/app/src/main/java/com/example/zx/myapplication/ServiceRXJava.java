package com.example.zx.myapplication;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by zx on 16-9-28.
 */
public interface ServiceRXJava {
    @GET("users/{username}")
    Observable<GitModel> getUsername(@Path("username") String username);
}
