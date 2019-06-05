package com.example.lourdesdinesh.rilsync;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    private static int Splash_Time_Out = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        }, Splash_Time_Out);
    }
}
