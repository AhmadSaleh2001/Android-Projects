package com.example.myapplication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private String url = "http://192.168.1.106:8000/?Text=";
    Button B;
    EditText Input;
    TextView ToShowAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B = findViewById(R.id.Btn);
        Input = findViewById(R.id.Input);
        ToShowAns = findViewById(R.id.ToShowAns);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData(url + Input.getText().toString());
            }
        });
    }
    private void getData(String URL) {
//        Toast.makeText(Predict.this, URL, Toast.LENGTH_SHORT).show();
        mRequestQueue = Volley.newRequestQueue(this);

        // String Request initialized
        mStringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                String Ans = response.toString();
                int Idx = 0;
                for(char C : Ans.toCharArray())
                {
                    if(C == '1')Idx = 1;
                }


                int Colors[] = {getResources().getColor(R.color.green) , getResources().getColor(R.color.red)};
                String Status[] = {"Not Cyberbullying" , "Cyberbullying"};
                ToShowAns.setVisibility(View.VISIBLE);
                ToShowAns.setText(Status[Idx]);
                ToShowAns.setBackgroundColor(Colors[Idx]);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "Error :" + error.toString());
            }
        });

        mRequestQueue.add(mStringRequest);
    }
}