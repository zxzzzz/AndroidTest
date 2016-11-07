package com.example.zx.httpretrofit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by zx on 16-9-23.
 */
public class MainActivity extends Activity {
    Button button;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.edit_text);
        textView=(TextView)findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Retrofit retrofit=new Retrofit.Builder().baseUrl("https://accounts.douban.com/").build();
                final Service service=retrofit.create(Service.class);
                Call<String> call=service.getUser("18361232878","19964162290zx");
                call.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        textView.setText(response.body().toString());
                        Toast.makeText(MainActivity.this,"dedaole",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"no",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
}
