package com.example.zx.myapplication;

import android.content.Context;
import android.provider.ContactsContract;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;

import okhttp3.ResponseBody;

/**
 * Created by zx on 16-9-28.
 */
 //管理 download载
public class DownloadManager {
    InputStream write;
    ResponseBody body;
    static final String PATH="PATH";
    Context context;
    //用来存储store Content-Type and file type
    static HashMap<String,String> contentHash=new HashMap<String ,String>();
    public DownloadManager(Context context1 ,ResponseBody responseBody)  {
        this.body = responseBody;
        context=context1;
        contentHash.put("application/x-bmp",".bmp");
        contentHash.put("image/gif",".gif");
        contentHash.put("application/x-img",".img");
        contentHash.put("image/jpeg",".jpe");
        contentHash.put("application/x-jpe",".jpe");
        contentHash.put("image/jpeg",".jpeg");
        contentHash.put("image/jpeg",".jpeg");
        contentHash.put("application/x-jpg",".jpg");
        contentHash.put("image/png",".png");
        contentHash.put("application/x-png",".png");

    }
    //文件读取方式
    public void down(){
        write=body.byteStream();
        String type=body.contentType().toString();
        String fileType=null;
        if (contentHash.containsKey(type))
            fileType=contentHash.get(type);
        String filepath=context.getFilesDir()+File.separator+new Date().getTime()+fileType;
        Log.i(PATH,filepath);
        FileOutputStream bufferedWriter;
        File file=new File(filepath);
        try {
            bufferedWriter=new FileOutputStream(file);

        byte[] buffer=new byte[1024];
        int byteRead=0;

            while ((byteRead = write.read(buffer)) != -1) {
                bufferedWriter.write(buffer, 0, byteRead);
            }
            bufferedWriter.flush();
            Log.i(PATH,"完毕");
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

}
