package com.example.administrator.nauraki;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        // Toast.makeText(Mutual_details.this,""+url2,Toast.LENGTH_SHORT).show();
        final RequestQueue queue = Volley.newRequestQueue(NotificationActivity.this);

       Toast.makeText(NotificationActivity.this,"enter",Toast.LENGTH_SHORT).show();


        final StringRequest jsonRequest = new StringRequest(Request.Method.GET, "https://naukari-9d391.firebaseio.com/satguru/upcoming_quiz_list"
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(NotificationActivity.this, "true" +response, Toast.LENGTH_LONG).show();





            }


        }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(NotificationActivity.this, "error       "+error, Toast.LENGTH_SHORT).show();
            }

        });


// Add the request to the RequestQueue.
        queue.add(jsonRequest);



    }


}

