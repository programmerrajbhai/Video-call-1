package com.girl.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Privacy extends AppCompatActivity {


    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        mWebview = new WebView(this);
        mWebview.loadUrl("https://sites.google.com/view/miralive/home?authuser=2");
        mWebview.getSettings().setJavaScriptEnabled(true);
        setContentView(mWebview);



    }
}