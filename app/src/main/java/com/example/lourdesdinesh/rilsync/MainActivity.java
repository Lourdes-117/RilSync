package com.example.lourdesdinesh.rilsync;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button atm_login;
    Button net_banking;
    Button open_maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atm_login=(Button)findViewById(R.id.atm_login);
        net_banking=(Button)findViewById(R.id.net_banking);
        open_maps=(Button)findViewById(R.id.open_maps);
        open_maps.setOnClickListener(this);
        atm_login.setOnClickListener(this);
        net_banking.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.atm_login) {
            Intent i1 = new Intent(MainActivity.this, AtmLogin.class);
            startActivity(i1);
        }
        else if(v.getId()==R.id.net_banking)
        {
            Intent i2=new Intent(MainActivity.this,NetBanking.class);
            startActivity(i2);
        }
        else if(v.getId()==R.id.open_maps)
        {
            Intent i3=new Intent(MainActivity.this,ATM_NearMe.class);
            startActivity(i3);
        }
    }
}