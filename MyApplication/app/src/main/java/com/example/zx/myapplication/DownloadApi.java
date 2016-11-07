package com.example.zx.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by zx on 16-9-28.
 */
// download big file url
public interface DownloadApi {
    @Streaming
    @GET("{url}")
    Observable<ResponseBody> downloadFile(@Path("url") String url);
}
