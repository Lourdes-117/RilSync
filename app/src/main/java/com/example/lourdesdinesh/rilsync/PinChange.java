package com.example.lourdesdinesh.rilsync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class PinChange extends AppCompatActivity {
    Button submitnewpin;
    EditText newpin1;
    RequestQueue requestQueue;
    String url="http://192.168.43.68/MyCode/pinchange.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_change);
        submitnewpin=(Button)findViewById(R.id.submitnewpin);
        newpin1=(EditText)findViewById(R.id.newpin1);
        requestQueue=Volley.newRequestQueue(getApplicationContext());



        submitnewpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String newpinint=newpin1.getText().toString();
                StringRequest  request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String,String>getParams()throws AuthFailureError{
                        Map<String,String> parameters=new HashMap<String, String>();
                        parameters.put("newpin",newpinint);
                        return parameters;
                    }
                };
                requestQueue.add(request);
            }
        });

    }
}