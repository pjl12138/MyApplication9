package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityGo extends Activity {
    public static final int REQUEST_CODE=0X111;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        editText=(EditText)findViewById(R.id.ed);
    }
    public void back(View view){
        Intent intent=new Intent();
        intent.putExtra("key",editText.getText().toString());
        setResult(REQUEST_CODE,intent);
        finish();
    }
}
