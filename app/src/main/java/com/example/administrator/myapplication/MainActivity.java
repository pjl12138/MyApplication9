package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE1=0x110;
    private final int REQUEST_CODE2=0x120;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.tv);
    }
    public void go(View view){
        startActivityForResult(new Intent(this,ActivityGo.class),REQUEST_CODE1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if(resultCode==REQUEST_CODE1&&requestCode==ActivityGo.REQUEST_CODE){
            if(null!=intent){
                String result=intent.getStringExtra("key");
                if(null!=result&&!"".equals(result)){
                    textView.setText(result);
                }
            }
        }
    }
}
