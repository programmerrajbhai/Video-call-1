package com.girl.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;

public class SMS_Delivery extends AppCompatActivity {

    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_delivery);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);


        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setAnimation(R.raw.anim);
        lottieAnimationView.playAnimation();


        FacebookAds.setBanner(findViewById(R.id.banner_container), SMS_Delivery.this);


        Button con= findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                       // Code here
        new FacebookAds(() -> {
            // Next Action
            //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(SMS_Delivery.this,HomePage.class));


        }).showInterstitial();
                    }
        });


    }
}