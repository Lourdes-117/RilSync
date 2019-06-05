package com.example.lourdesdinesh.rilsync;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class NetBanking extends AppCompatActivity implements View.OnClickListener {
    Button nb_hdfc;
    Button nb_iob;
    Button nb_kotak;
    Button nb_axis;
    Button nb_cb;
    Button nb_hsbc;
    Button nb_sbi;
    Button nb_iib;
    WebView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_banking);
        nb_hdfc=(Button)findViewById(R.id.nb_union);
        nb_iob=(Button)findViewById(R.id.nb_iob);
        nb_kotak=(Button)findViewById(R.id.nb_kotak);
        nb_axis=(Button)findViewById(R.id.nb_axis);
        nb_cb=(Button)findViewById(R.id.nb_cb);
        nb_hsbc=(Button)findViewById(R.id.nb_hsbc);
        nb_sbi=(Button)findViewById(R.id.nb_sbi);
        nb_iib=(Button)findViewById(R.id.nb_iib);
        vv=(WebView)findViewById(R.id.webview);
        nb_hdfc.setOnClickListener(this);
        nb_iob.setOnClickListener(this);
        nb_kotak.setOnClickListener(this);
        nb_axis.setOnClickListener(this);
        nb_cb.setOnClickListener(this);
        nb_hsbc.setOnClickListener(this);
        nb_sbi.setOnClickListener(this);
        nb_iib.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.nb_union) {
            String url = "https://www.unionbankonline.co.in/corp/BANKAWAY?Action.RetUser.Init.001=Y&AppSignonBankId=026&AppType=corporate/";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_iob)
        {
            String url="https://www.iobnet.co.in/ibanking/login.do";
            //Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            //startActivity(i2);
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);

        }
        else if(v.getId()==R.id.nb_kotak)
        {
            String url="https://www.kotak.com/j1001mp/netapp/MainPage.jsp";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_axis)
        {
            String url="https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/hc6xDoIwEAbgZ2Fg5S6tGuJWBiNEExcidDHFQEFLS0oFH180Tkbxtv_y_bkDDhlwLYZGCtcYLdQz89WJHrYLQpEkYRohsjhOo82eISKdQD4B_DEM__WPwOcJeYOZEwlwqUzxejdnuqChBG7LqrSlDW52WtfOdf3aRx_HcQzEvekLoa_B2bQ-fivVpneQfVro2gwvSzXsmOc9ALj9CfQ!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/?_ga=2.263935881.427506550.1521694008-514485600.1521694008";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_cb)
        {
            String url="https://netbanking.canarabank.in/entry/ENULogin.jsp";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_hsbc)
        {
            String url="https://www.hsbc.co.in/1/2/!ut/p/c5/04_SB8K8xLLM9MSSzPy8xBz9CP0os3gDf6NAZ8tQU3c3A0dDV5MAf2MTAwgAykeaxYdYBLtbOhk6GvgbGzgZeLp7G1s6G7gYulsaEtAdqR9ljiFvamwGl89JTU9MrtQPzdMPy8svygU6KFjfzyM_N1W_IDeissLEUREAZoOUlg!!/dl3/d3/L0lJSklna21DU1EhIS9JRGpBQUl5QUJFUkNKRXFnLzRGR2dzbzBWdnphOUlBOW9JQSEhLzdfME8yUUM5VTVHRjBBMUU0UDUzNjAwMDAwMDAvWmY2YjU2NTAwMDAzL3NhLjAuNTI4NDM1MTAyNjY3NjE1Mw!!/";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_sbi)
        {
            String url="https://retail.onlinesbi.com/retail/login.htm";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nb_iib)
        {
            String url="https://indusnet.indusind.com/corp/BANKAWAY?Action.RetUser.Init.001=Y&AppSignonBankId=234&AppType=corporate&CorporateSignonLangId=001";
            vv.setWebViewClient(new WebViewClient());
            vv.getSettings().setJavaScriptEnabled(true);
            vv.loadUrl(url);
            vv.setVisibility(View.VISIBLE);
        }
    }
}
