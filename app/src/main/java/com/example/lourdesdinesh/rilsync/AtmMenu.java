package com.example.lourdesdinesh.rilsync;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AtmMenu extends AppCompatActivity implements View.OnClickListener {

    Button atm_enq;
    Button pinchange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_menu);
        atm_enq=(Button)findViewById(R.id.atm_enq);
        pinchange=(Button)findViewById(R.id.pinchange);
        pinchange.setOnClickListener(this);
        atm_enq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.atm_enq) {
            Intent i = new Intent(AtmMenu.this, AtmEnquiry.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.pinchange)
        {
            Intent i2 = new Intent(AtmMenu.this, PinChange.class);
            startActivity(i2);
        }
    }
}
