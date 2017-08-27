package com.ulmaxy.gitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    interface CustomListener extends View.OnClickListener {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "b1");
        Log.d("TAG", "aaa b1");

        Log.d("TAG", "First branch");
        Log.d("TAG", "First branch2");
        Log.d("TAG", "bla bla");
        Log.d("TAG", "some_branch");
        1
                2
    }
}