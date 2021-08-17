package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button h= (Button)findViewById(R.id.btnHello);
        OnClickListener O  = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Debug Message", "Printing to logcat");
                Toast.makeText(v.getContext(), "Hello World", Toast.LENGTH_LONG).show();
            }
        };
        h.setOnClickListener(O);
    }
}