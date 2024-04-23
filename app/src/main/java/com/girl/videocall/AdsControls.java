package com.girl.videocall;


import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.AdsUnit;
import com.bdtopcoder.quickadmob.onDismiss;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AdsControls {

    public static void AdUnit(){


 /*   //Real Ads
    AdsUnit.BANNER = "ca-app-pub-9942675686139849/8866025286";
        AdsUnit.INTERSTITIAL = "ca-app-pub-9942675686139849/7525023459";
        AdsUnit.REWARDED = "ca-app-pub-9942675686139849/9768043412";

*/


//TEST ADS
AdsUnit.BANNER = "ca-app-pub-3940256099942544/6300978111";
 AdsUnit.INTERSTITIAL = "ca-app-pub-3940256099942544/1033173712";


/*

        Banner		 - ca-app-pub-3940256099942544/6300978111
        Interstitial	 - ca-app-pub-3940256099942544/1033173712
*/

  /*      new Admob(new onDismiss() {
            @Override
            public void onDismiss() {
                // When Ads Close Take Action
                // 1. Go to New Activity what you want Actually
            }
        }).ShowInterstitial(MainActivity.this, true);

        */

   /*     new Admob(new onDismiss() {
            @Override
            public void onDismiss() {
                // When Ads Close Take Action
                // 1. Give Some Reword


            }
        }).ShowRewarded(MainActivity.this, true);
        finish();

*/
    }



}
