package com.example.koheejin.testvolley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.tongtong.tonglib.io.volley.ParamRequest;
import com.tongtong.tonglib.util.LogUtil;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    private Response.ErrorListener mDefaultErrorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            LogUtil.e("Volley Error -> %s", error.getMessage());
        }
    };

    private Response.Listener<String> getDefaultListener1 = new Response.Listener<String>() {
        @Override
        public void onResponse(String response)
        {
            LogUtil.d("Volley Response -> %s", response.toString());

            textView.setText("\n\n" + textView.getText() + "\n" + response.toString());
        }
    };

    private Response.Listener<String> getDefaultListener2 = new Response.Listener<String>() {
        @Override
        public void onResponse(String response)
        {
            LogUtil.d("Volley Response -> %s", response.toString());

            textView.setText("\n\n" + textView.getText() + "\n" + response.toString());
        }
    };

    private Response.Listener<String> getDefaultListener3 = new Response.Listener<String>() {
        @Override
        public void onResponse(String response)
        {
            LogUtil.d("Volley Response -> %s", response.toString());

            textView.setText("\n\n" + textView.getText() + "\n" + response.toString());
        }
    };

    private Response.Listener<String> getDefaultListener4 = new Response.Listener<String>() {
        @Override
        public void onResponse(String response)
        {
            LogUtil.d("Volley Response -> %s", response.toString());

            textView.setText("\n\n" + textView.getText() + "\n" + response.toString());
        }
    };

    private Response.Listener<String> getDefaultListener5 = new Response.Listener<String>() {
        @Override
        public void onResponse(String response)
        {
            LogUtil.d("Volley Response -> %s", response.toString());

            textView.setText("\n\n" + textView.getText() + "\n" + response.toString());
        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        testGetRequest(1, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(2, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(3, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(4, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(5, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(6, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(7, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(8, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(9, getDefaultListener1, mDefaultErrorListener);
        testGetRequest(10, getDefaultListener1, mDefaultErrorListener);


        testPutRequest(getDefaultListener1, mDefaultErrorListener);
        testPutRequest(getDefaultListener1, mDefaultErrorListener);

    }

    void testGetRequest(final int noticeId, Response.Listener<String> successListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://hjkowork4u.godohosting.com/cashlotto/test/test_hangul.php";

        ParamRequest request = new ParamRequest(Request.Method.POST, url, successListener, errorListener);
        request.addParam("notice_id", String.valueOf(noticeId));

        LogUtil.d(">>> noticeId : %d", noticeId);
        LogUtil.d(">>> URL : %s", request.getUrl());

        // add it to the RequestQueue
        queue.add(request);
    }

    void testPutRequest(Response.Listener<String> successListener, Response.ErrorListener errorListener) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://hjkowork4u.godohosting.com/cashlotto/test/test_json_hangul.php";

        ParamRequest request = new ParamRequest(Request.Method.POST, url, successListener, errorListener);

        LogUtil.d(">>> URL : %s", request.getUrl());

        // add it to the RequestQueue
        queue.add(request);

    }
}
