package com.girl.videocall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//FACEBOOKK ADS Start
        //Ad Unit Id
        FBAdUnitID.FBPlacementID();


//        Step 5. Initialize the Audience Network SDK

        FacebookAds.loadInterstitial(SplashScreen.this);
//FACEBOOKK ADS Clos



        AdsControls.AdUnit();


        // Load Interstitial Ads
        Admob.loadInterstitialAds(this);

        // Load Reworded Ads
        Admob.loadRewordedAds(this);

    //For Splash Screen
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Code here
                Intent myIntent = new Intent(SplashScreen.this, Next_Screen .class);
                startActivity(myIntent);
                finish();
            }
        },2000);
    }



}