package com.girl.videocall;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atikulsoftware.metaadslibrary.MetaAds.FacebookAds;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Tag;


public class Next_Screen extends AppCompatActivity {


    CardView btn3;
    RelativeLayout Activity3,Activity2,Activity1;


    // Initialize Firebase


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_screen);



        askNotificationPermission();
        callInAppUpdate();

        btn3= findViewById(R.id.btn3);
        Activity3= findViewById(R.id.Activity3);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("your_reference_path");



        TextView txt = (TextView) findViewById(R.id.Textview1);
        txt.setPaintFlags(txt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        // Set Banner Ads
        Admob.setBanner(findViewById(R.id.showBanner),Next_Screen.this);
        //Facebook Implemention Start
        //Facebook Implemention clos
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   Toast.makeText(Next_Screen.this, "yes", Toast.LENGTH_SHORT).show();




                    startActivity(new Intent(Next_Screen.this, HomePage.class));






            }
        });



    }

    //THis is Notification channel code start



    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (isGranted) {
                    // FCM SDK (and your app) can post notifications.
                } else {
                    // TODO: Inform user that that your app will not show notifications.
                }
            });

    private void askNotificationPermission() {
        // This is only necessary for API level >= 33 (TIRAMISU)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) ==
                    PackageManager.PERMISSION_GRANTED) {
                // FCM SDK (and your app) can post notifications.
               // Toast.makeText(Next_Screen.this,"allowed",Toast.LENGTH_LONG).show();

            } else if (shouldShowRequestPermissionRationale(android.Manifest.permission.POST_NOTIFICATIONS)) {


               // Toast.makeText(Next_Screen.this,"canceled",Toast.LENGTH_LONG).show();

                 } else {
                // Directly ask for the permission
                requestPermissionLauncher.launch(android.Manifest.permission.POST_NOTIFICATIONS);
            }
        }
    }



//THis is Flaxible Updating code start
//THis is Flaxible Updating code start

    private final int UPDATE_REQUEST_CODE=1612;


    @Override
    protected void onPostResume() {
        super.onPostResume();

        callInAppUpdate();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data==null) return;
        if (requestCode==UPDATE_REQUEST_CODE){
            Toast.makeText(Next_Screen.this, "Downloading Start", Toast.LENGTH_SHORT).show();
            if (resultCode!= RESULT_OK){

                Log.d(TAG,"OnActivityResult: Update flew failed"+  resultCode );

            }
        }



    }



    private void callInAppUpdate(){

        AppUpdateManager appUpdateManager = AppUpdateManagerFactory.create(Next_Screen.this);

// Returns an intent object that you use to check for an update.
        Task<AppUpdateInfo> appUpdateInfoTask = appUpdateManager.getAppUpdateInfo();

// Checks that the platform will allow the specified type of update.
        appUpdateInfoTask.addOnSuccessListener(appUpdateInfo -> {
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
                    // This example applies an immediate update. To apply a flexible update
                    // instead, pass in AppUpdateType.FLEXIBLE
                    && appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {
                // Request the update.


                try {
                    //my coding
                    appUpdateManager.startUpdateFlowForResult(appUpdateInfo,AppUpdateType.IMMEDIATE
                            ,Next_Screen.this,UPDATE_REQUEST_CODE);


                }catch (IntentSender.SendIntentException exception){


                    Log.d(TAG,"callInAppUpdate:"+ exception.getMessage());

                }


            }
        });

    }



}