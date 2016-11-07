package com.example.zx.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.jar.Manifest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by root on 16-9-27.
 */
public class MainActivity extends Activity {
    Button button;//test retrofit
    EditText editText;//get the url or paititial url
    TextView textView;//show your information
    Button showPicture;//
    ImageView picture;//test picasso
    Button testRxJava;//test Rxjava
    Button downLoad;//download file
    static final String NetLOG = "NETLOG";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.text);
        showPicture = (Button) findViewById(R.id.showPicture);
        picture = (ImageView) findViewById(R.id.picture);
        downLoad=(Button)findViewById(R.id.downLoad);
        //测试测测试test to 测试测试retrofit,return your username andr github url
        testRxJava=(Button)findViewById(R.id.testRxJava);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create()).build();

                Service service = retrofit.create(Service.class);
                Call<GitModel> call = service.getSearchBooks(name);
                call.enqueue(new Callback<GitModel>() {
                    @Override
                    public void onResponse(Call<GitModel> call, Response<GitModel> response) {
                        Log.i(NetLOG, "onresponse");
                        GitModel user = response.body();
                        Log.i(NetLOG, response.body().getLogin() + "mmmmmm");
                        textView.setText("Name  " + response.body().getLogin() + "\nUrl: " + response.body().getUrl() + "\n When: " + response.body().getCreatedAt());
                        // Toast.makeText(MainActivity.this, "dedaole", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<GitModel> call, Throwable t) {
                        Log.i(NetLOG, t.toString());
                        Toast.makeText(MainActivity.this, "no", Toast.LENGTH_SHORT).show();
                        t.printStackTrace();


                    }
                });

            }});

        //test to Picasso ,show a picture form internet
        showPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(MainActivity.this).load("http://img.hb.aicdn.com/2109faba7778862bcad10bf98c5ecb7d47f094651a9f0-BH9POJ_fw580").into(picture, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this,"成功",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onError() {
                        Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        //test PXJava
        testRxJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                Retrofit retrofit=new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .baseUrl("https://api.github.com/").build();
                ServiceRXJava serviceRXJava=retrofit.create(ServiceRXJava.class);
                serviceRXJava.getUsername(name)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<GitModel>() {
                            @Override
                            public void onCompleted() {
                                Toast.makeText(MainActivity.this,"完成",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(GitModel gitModel) {
                                String user=gitModel.getLogin();
                                textView.setText("Name: "+user);

                            }
                        }
                );


            }
        }
        );
        //download
        downLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=null;
                if (editText.getText()!=null)
                    url=editText.getText().toString();
                Retrofit retrofit=new Retrofit.Builder().addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl("http://huaban.com/")
                        .build();
                DownloadApi downloadApi=retrofit.create(DownloadApi.class);
                downloadApi.downloadFile("img/touch-icon-ipad-retina.png")
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.io())
                        .subscribe(new Observer<ResponseBody>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(ResponseBody responseBody) {
                                DownloadManager downloadManager=new DownloadManager(MainActivity.this,responseBody);
                                downloadManager.down();
                                            }
                        });



            }
        });
    }}
