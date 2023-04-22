package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        WebView textView = findViewById(R.id.textView);
        textView.loadUrl("C://Users//acer//AndroidStudioProjects//List//appsrc//main//res//formulas"+ getIntent().getStringExtra("key"));
    }
}