package com.girl.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.LinearLayout;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;

public class Call_End_After extends AppCompatActivity {

    LinearLayout agreeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_end_after);
        agreeBTN= findViewById(R.id.agreeBTN);

        agreeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Call_End_After.this,HomePage.class));

         /*        new FacebookAds(() -> {
                            // Next Action
                            //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();
                     startActivity(new Intent(Call_End_After.this,HomePage.class));


                        }).showInterstitial();
*/

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}