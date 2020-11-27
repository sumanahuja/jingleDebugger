package com.example.hp.jingledebuggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.error_debugger.ErrorDebug;
import com.example.jingledebugger1.JDebugger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  JDebugger.d("This is Debug module");
        //ErrorDebug.e("This is Error module");
    }
}
