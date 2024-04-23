package com.girl.videocall;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;

import de.hdodenhof.circleimageview.CircleImageView;

public class SendSMS extends AppCompatActivity {



    public static String TITLEX = "";


    public static Bitmap MY_BITMAPX = null;
    CircleImageView coverImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);

        ImageView backg= findViewById(R.id.backg);
        ImageView send= findViewById(R.id.send);
        TextView tv= findViewById(R.id.tv);
        TextView tvTitle= findViewById(R.id.tvTitle);


        FacebookAds.setBanner(findViewById(R.id.banner_container), SendSMS.this);

        coverImage= findViewById(R.id.coverImage);

        tvTitle.setText(TITLEX);

        if (MY_BITMAPX != null) coverImage.setImageBitmap(MY_BITMAPX);

        LinearLayout nameplat= findViewById(R.id.nameplat);
        LinearLayout give= findViewById(R.id.give);

        give.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(SendSMS.this,SMS_Delivery.class));


                }).showInterstitial();


            }
        });


        nameplat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(SendSMS.this,HomePage.class));


                }).showInterstitial();


            }
        });


        ImageView call= findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                new FacebookAds(() -> {
                    // Next Action
                    //  Toast.makeText(MainActivity.this, "Ads Closed", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(SendSMS.this,MainActivity.class));


                }).showInterstitial();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText edittext= findViewById(R.id.edittext);

                String ed= edittext.getText().toString().trim();

                tv.setText(ed);
                edittext.setText("");

                startActivity(new Intent(SendSMS.this,SMS_Delivery.class));

            }
        });





        backg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SendSMS.this,Details_Person.class));
            }
        });

    }
}