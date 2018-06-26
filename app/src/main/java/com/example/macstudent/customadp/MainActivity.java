package com.example.macstudent.customadp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    String path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/";
    File f = new File(path);
        if(!f.exists()){
        path = "/storage/sdcard0/whatsApp/Media/WhatsApp Images";
        f = new File(path);
            }
File []files = f.listFiles();
        ListView l

    }
}
