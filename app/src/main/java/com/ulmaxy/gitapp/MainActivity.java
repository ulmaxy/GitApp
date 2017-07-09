package com.ulmaxy.gitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "b1");
        Log.d("TAG", "aaa b1");

        Log.d("TAG", "First branch");
        Log.d("TAG", "First branch2");
    }
}
