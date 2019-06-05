package com.example.lourdesdinesh.rilsync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ATM_NearMe extends AppCompatActivity {
WebView atmmaps;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm__near_me);
      atmmaps=(WebView)findViewById(R.id.atmmaps);
      String url="https://www.google.co.in/maps/search/atm+near+me/";
      atmmaps.setWebViewClient(new WebViewClient());
      atmmaps.getSettings().setJavaScriptEnabled(true);
      atmmaps.loadUrl(url);

    }
}
