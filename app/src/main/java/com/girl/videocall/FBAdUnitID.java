package com.girl.videocall;

import android.view.View;

import com.atikulsoftware.metaadslibrary.MetaAds.AdsUnit;
import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;

public class FBAdUnitID {



    public static void FBPlacementID(){

/*

        //FOR REAL ADS
        AdsUnit.BANNER = "278450621730357_278510448391041";
        AdsUnit.INTERSTITIAL = "278450621730357_278975645011188";
*/


//Test Ads



   AdsUnit.BANNER = "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID";
        AdsUnit.INTERSTITIAL = "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID";



        // For INT code

    /*    // Code here
        new FacebookAds(() -> {
            // Next Action
            //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();



        }).showInterstitial();*/


    }

}
