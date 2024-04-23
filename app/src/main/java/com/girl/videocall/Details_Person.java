package com.girl.videocall;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;

import de.hdodenhof.circleimageview.CircleImageView;

public class Details_Person extends AppCompatActivity {


    public static String TITLE = "";


    public static Bitmap MY_BITMAP = null;

    CircleImageView coverImage;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_person);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        coverImage = findViewById(R.id.coverImage);

        tvTitle = findViewById(R.id.tvTitle);

        FacebookAds.setBanner(findViewById(R.id.banner_container), Details_Person.this);


        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setAnimation(R.raw.live);
        lottieAnimationView.playAnimation();

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(Details_Person.this, MainActivity.class));


                }).showInterstitial();


            }
        });


        ImageView coverImage = findViewById(R.id.coverImage);


        coverImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bitmap bitmap = ((BitmapDrawable) coverImage.getDrawable()).getBitmap();
                View_Profile.MY_BITMAPXX = bitmap;

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Details_Person.this, View_Profile.class));
                }).showInterstitial();



            }
        });

        LinearLayout sendsms = findViewById(R.id.sendsms);
        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String videoLoadid = tvTitle.getText().toString().trim();
                SendSMS.TITLEX = videoLoadid;


                Bitmap bitmap = ((BitmapDrawable) coverImage.getDrawable()).getBitmap();
                SendSMS.MY_BITMAPX = bitmap;

                // startActivity(new Intent(MainActivity.this,Details_Person.class));


                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();


                    startActivity(new Intent(Details_Person.this, SendSMS.class));
                }).showInterstitial();


            }
        });

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, MainActivity.class));


                }).showInterstitial();

            }
        });


        tvTitle.setText(TITLE);

        if (MY_BITMAP != null) coverImage.setImageBitmap(MY_BITMAP);
        LinearLayout g1= findViewById(R.id.g1);
        LinearLayout g2= findViewById(R.id.g2);
        LinearLayout g3= findViewById(R.id.g3);
        LinearLayout g4= findViewById(R.id.g4);
        LinearLayout g5= findViewById(R.id.g5);
        LinearLayout g6= findViewById(R.id.g6);
        LinearLayout g7= findViewById(R.id.g7);
        LinearLayout g8= findViewById(R.id.g8);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Details_Person.this, SMS_Delivery.class));
                }).showInterstitial();
            }
        });


    }
}