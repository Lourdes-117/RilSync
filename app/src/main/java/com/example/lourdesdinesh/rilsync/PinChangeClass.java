package com.example.lourdesdinesh.rilsync;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lourdes Dinesh on 3/23/2018.
 */

public class PinChangeClass
{
    private static final String PinChangeUrl="http://192.168.0.101/MyCode/pinchange.php";
    private Map<String,String> parms;
    public  PinChangeClass(String newpin, Response.Listener<String>listener)
    {
       // super(Request.Method.POST,PinChangeUrl,listener,null);
        parms=new HashMap<>();
        parms.put("newpin",newpin);
    }
    //@Override
    public Map<String,String> getParms(){
        return parms;
    }
}
