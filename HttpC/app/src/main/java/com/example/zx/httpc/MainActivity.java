package com.example.zx.httpc;

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
import retrofit2.converter.gson.GsonConverterFactory;

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
                String name=editText.getText().toString();
                Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create()).build();
                Service service=retrofit.create(Service.class);
                Call<GitModel> call=service.getSearchBooks(name);
                call.enqueue(new Callback<GitModel>() {
                    @Override
                    public void onResponse(Call<GitModel> call, Response<GitModel> response) {
                        GitModel user = response.body();
                        if (user != null) {
                            textView.setText("Name" + response.body().getLogin());
                            Toast.makeText(MainActivity.this, "dedaole", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onFailure(Call<GitModel> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"no",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }
}
