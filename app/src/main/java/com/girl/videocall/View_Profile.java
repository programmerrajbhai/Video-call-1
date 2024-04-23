package com.girl.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;

public class View_Profile extends AppCompatActivity {
    public static String TITLEEE = "";

    TextView tvTitlee;


    ///=============View Images
    private Matrix matrix = new Matrix();
    private float scale = 1f;
    private ScaleGestureDetector scaleGestureDetector;

    public static Bitmap MY_BITMAPXX = null;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_profile);


        FacebookAds.setBanner(findViewById(R.id.banner_container), View_Profile.this);

        tvTitlee= findViewById(R.id.tvTitlee);
        ImageView coverImage= findViewById(R.id.coverImage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        tvTitlee.setText(TITLEEE);
        if (MY_BITMAPXX != null) coverImage.setImageBitmap(MY_BITMAPXX);





    }



}