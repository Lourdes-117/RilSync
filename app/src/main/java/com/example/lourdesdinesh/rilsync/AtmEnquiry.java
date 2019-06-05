package com.example.lourdesdinesh.rilsync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class AtmEnquiry extends AppCompatActivity implements View.OnClickListener {
    TextView view_enq;
    Button get_enq;
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_enquiry);
        view_enq=(TextView)findViewById(R.id.view_enq);
        get_enq=(Button)findViewById(R.id.get_enq);
        get_enq.setOnClickListener(this);
        mQueue = Volley.newRequestQueue(this);
    }

    @Override
    public void onClick(View v) {
    Enquire();
    }
    private void Enquire() {

        String url = "http://192.168.43.68/MyCode/login.php";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            int idz = response.getInt("id");
                            String namez= response.getString("name");
                            String pinz = response.getString("pin");
                            String balancez=response.getString("balance");
                            String swipedz=response.getString("swiped");
                            view_enq.setText("Account Number " +idz+"\n\nAccount Name: "+namez+"\n\nCurrent Balance: "+balancez);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        mQueue.add(request);
    }

}
