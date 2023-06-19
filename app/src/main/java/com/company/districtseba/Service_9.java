package com.company.districtseba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Service_9 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;
    LottieAnimationView   journalist1,journalist2,journalist3,journalist4,journalist5;
    ImageView back;
    public String num="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service9);

        journalist1=findViewById(R.id.journalist1);
        journalist2=findViewById(R.id.journalist2);
        journalist3=findViewById(R.id.journalist3);
        journalist4=findViewById(R.id.journalist4);

        back=findViewById(R.id.back9);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Service_9.super.onBackPressed();

            }
        });





        //=================//
        journalist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01712-235827";
                callPhoneNumber();
            }
        });
        journalist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01716-416055";
                callPhoneNumber();
            }
        });
        journalist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01760-333214";
                callPhoneNumber();
            }
        });
        journalist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01728-343748";
                callPhoneNumber();
            }
        });
      /*  journalist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01";
                callPhoneNumber();
            }
        });*/



    }

    //......................call method.....................//

    @SuppressLint("MissingSuperCall")
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        if(requestCode == 101)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                callPhoneNumber();
            }
        }
    }

    public void callPhoneNumber()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Service_9.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + num));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + num));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }





}