package com.girl.videocall;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.hardware.Camera;

import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<video> videoList;
    private VideoAdapter adapter;


    private Camera mCam;
    private MirrorView mCamPreview;
    private int mCameraId = 0;
    private FrameLayout mPreviewLayout;
    final private int REQUEST_CODE_CAMERA = 1;

    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        ImageView endCall = findViewById(R.id.endCall);
        ImageView backfont = findViewById(R.id.backfont);
        ImageView voice = findViewById(R.id.voice);
        ImageView video = findViewById(R.id.video);



        if (mediaPlayer!=null) mediaPlayer.release();

        mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.call);
        mediaPlayer.start();


        endCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {



            if (mediaPlayer !=null) mediaPlayer.pause();
                mediaPlayer.pause();


                startActivity(new Intent(MainActivity.this,Call_End_After.class));





            }
        });

        backfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        videoList = new ArrayList<>();


//No call
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video/a%20(1).mp4", "New Title okay", "new description here"));
        //No call
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video/a%20(1).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(2).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(3).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(4).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(5).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(6).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(7).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(8).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(9).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(10).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(11).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(12).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(13).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(14).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(15).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(16).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(17).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(18).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(19).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(20).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(21).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(22).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(23).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(24).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(25).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(26).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(27).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(28).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(29).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(30).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(31).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(32).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(33).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(34).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(35).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(36).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(37).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(38).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(39).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(40).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(41).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(42).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(43).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(44).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(45).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(46).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(47).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(48).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(49).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(50).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(51).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(52).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(53).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(54).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(55).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(56).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(57).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(58).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(59).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(60).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/a%20(61).mp4", "New Title okay", "new description here"));


        videoList.add(new video("https://miralive.xyz/videot/item%20(1).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(2).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(3).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(4).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(5).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(6).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(7).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(8).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(9).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(10).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(11).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(12).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(13).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(14).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(15).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(16).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(17).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(18).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(19).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(20).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(21).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(22).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(23).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(24).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(25).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(26).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(27).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(28).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(29).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(30).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(31).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(32).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(33).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(34).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(36).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(37).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(38).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(39).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(40).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(41).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(42).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(43).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(44).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(45).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(46).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(47).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(48).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(50).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(51).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(52).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(53).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(54).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(55).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/item%20(56).mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video/fake%20(1).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(2).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(3).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(4).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(5).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(6).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(7).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(8).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(9).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(10).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(11).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(12).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(13).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(14).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(15).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(16).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(17).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(18).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(19).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(20).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(21).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(22).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(23).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(24).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(25).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(26).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(27).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(28).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(29).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(30).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(31).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(32).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(33).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(34).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(35).mp4", "New Title okay", "new description here"));
/////////////////DOUBLE
/////////////////DOUBLE
/////////////////DOUBLE
/////////////////DOUBLE
/////////////////DOUBLE
/////////////////DOUBLE
        videoList.add(new video("https://miralive.xyz/video/fake%20(1).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(2).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(3).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(4).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(5).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(6).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(7).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(8).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(9).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(10).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(11).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(12).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(13).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(14).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(15).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(16).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(17).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(18).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(19).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(20).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(21).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(22).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(23).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(24).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(25).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(26).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(27).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(28).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(29).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(30).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(31).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(32).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(33).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(34).mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video/fake%20(35).mp4", "New Title okay", "new description here"));


     /*   https://miralive.xyz/fakevideo/fake%20(1).mp4
        https://miralive.xyz/fakevideo/fake(1).mp4
        https://miralive.xyz/fakevideo/fake%20(1).mp4
*/



        // videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.sang1, "New Title okay2", "new description here2"));
        //videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.sang2, "New Title okay2", "new description here2"));
        //   Toast.makeText(MainActivity.this, "VISIBIL", Toast.LENGTH_SHORT).show();*/


        // serverDATA();
        //../ ,,  MyAdapter myAdapter = new MyAdapter();
        //  viewPager2.setAdapter(myAdapter);
        //  videoList.add(new video( title,"New Title okay","new description here"));


        viewPager2 = findViewById(R.id.viewPager2);

        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
        viewPager2.setUserInputEnabled(false);
        Collections.shuffle(videoList);
//OPEN CAMERA CODE START
//OPEN CAMERA CODE START
//OPEN CAMERA CODE START

        mCamPreview = new MirrorView(this, mCam);
        mCameraId = findFirstFrontFacingCamera();

        mPreviewLayout = (FrameLayout) findViewById(R.id.camPreview);
        mPreviewLayout.removeAllViews();

        int hasWriteStoragePermission = 0;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            hasWriteStoragePermission = checkSelfPermission(Manifest.permission.CAMERA);
        }

        if (hasWriteStoragePermission != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.CAMERA},
                        REQUEST_CODE_CAMERA);
            }
            //return;
        }


        startCameraInLayout(mPreviewLayout, mCameraId);
        mCamPreview.setCameraDisplayOrientationAndSize(mCameraId);


    }


    private int findFirstFrontFacingCamera() {
        int foundId = -1;
        int numCams = Camera.getNumberOfCameras();
        for (int camId = 0; camId < numCams; camId++) {
            Camera.CameraInfo info = new Camera.CameraInfo();
            Camera.getCameraInfo(camId, info);
            if (info.facing == Camera.CameraInfo.CAMERA_FACING_FRONT) {
                foundId = camId;
                break;
            }
        }
        return foundId;
    }


    private void startCameraInLayout(FrameLayout layout, int cameraId) {
        mCam = Camera.open(cameraId);
        if (mCam != null) {
            mCamPreview = new MirrorView(this, mCam);
            layout.addView(mCamPreview);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mCam == null && mPreviewLayout != null) {
            mPreviewLayout.removeAllViews();
            startCameraInLayout(mPreviewLayout, mCameraId);
        }
    }

    @Override
    protected void onPause() {
        if (mCam != null) {
            mCam.release();
            mCam = null;
        }
        super.onPause();
    }

    public void alertDialouge() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Call end")
                .setIcon(R.drawable.callend)
                .setMessage("Continue will play and Advertisment")
                .setCancelable(false)
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Context context = MainActivity.this;
                        Intent intent = new Intent(context, HomePage.class);
                        context.startActivity(intent);


                        finish();

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }


}