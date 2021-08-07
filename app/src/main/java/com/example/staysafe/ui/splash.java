package com.example.staysafe.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.staysafe.MainActivity;
import com.example.staysafe.R;

public class splash extends AppCompatActivity {
    private static int splashs=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splash.this, MainActivity.class);
                        startActivity(intent);
                finish();
    }
},splashs);
    }
}