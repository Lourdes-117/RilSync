package com.example.lourdesdinesh.rilsync;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class AtmLogin extends AppCompatActivity {
    private TextView mTextViewResult;
    private RequestQueue mQueue;
    EditText et1;
    TextView tv;
    int idz;
    int lock=0;
    int pinz;
    String namez;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_login);
        mTextViewResult = findViewById(R.id.text_view_result);
        Button buttonParse = findViewById(R.id.button_parse);
        et1=(EditText)findViewById(R.id.editText);
        mQueue = Volley.newRequestQueue(this);
        et2=(EditText)findViewById(R.id.editText2);

        buttonParse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonParse();
                int temp = Integer.parseInt(et1.getText().toString());
                int temp2=Integer.parseInt(et2.getText().toString());
                if(pinz == temp && temp2==idz)
                {
                    Toast.makeText(getBaseContext(),"You Have Successfully Logged In",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(AtmLogin.this,AtmMenu.class);
                    startActivity(i);
                }
                else
                {
                    lock=lock+1;
                    if(lock>2)
                    {
                        Toast.makeText(getBaseContext(),"Sorry, Your pin is Wrong!",Toast.LENGTH_LONG).show();
                        Intent i1=new Intent(AtmLogin.this,MainActivity.class);
                        startActivity(i1);

                    }
                }
            }
        });
    }

    private void jsonParse() {

        String url = "http://192.168.43.68/MyCode/login.php";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            idz = response.getInt("id");
                            namez= response.getString("name");
                            pinz = Integer.parseInt(response.getString("pin"));
                            String balancez=response.getString("balance");
                            String swipedz=response.getString("swiped");
                            mTextViewResult.setText("Hello " +String.valueOf(namez)+"\nClick Again to Submit Pin");
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