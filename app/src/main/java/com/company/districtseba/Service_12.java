package com.company.districtseba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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

public class Service_12 extends AppCompatActivity {


    AdView mAdView;
    InterstitialAd mInterstitialAd;
    CardView Eseba1,Eseba2,Eseba3,Eseba4,Eseba5,Eseba6,Eseba7;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service12);



        Eseba1=findViewById(R.id.Eseba1);
        Eseba2=findViewById(R.id.Eseba2);
        Eseba3=findViewById(R.id.Eseba3);
        Eseba4=findViewById(R.id.Eseba4);
        Eseba5=findViewById(R.id.Eseba5);
        Eseba6=findViewById(R.id.Eseba6);
        Eseba7=findViewById(R.id.Eseba7);

       back=findViewById(R.id.back12);
       back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Service_12.super.onBackPressed();

           }
       });




        //=======Eseba===========//
        Eseba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://services.nidw.gov.bd/nid-pub/register-account";
                Web_browser.WEBSITE_TITLE="NID নতুন নিবন্ধনের জন্য আবেদন";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://eboardresults.com/v2/home";
                Web_browser.WEBSITE_TITLE="Education Board Result";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.epassport.gov.bd/landing";
                Web_browser.WEBSITE_TITLE="Welcome to Bangladesh e-Passport Portal";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://bdris.gov.bd/br/application";
                Web_browser.WEBSITE_TITLE="নতুন জন্ম নিবন্ধনের জন্য আবেদন";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://everify.bdris.gov.bd/";
                Web_browser.WEBSITE_TITLE="জন্ম নিবন্ধন তথ্য অনুসন্ধান";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://bdris.gov.bd/br/correction";
                Web_browser.WEBSITE_TITLE="জন্ম তথ্য সংশোধনের জন্য আবেদন";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        Eseba7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.daraz.com.bd/";
                Web_browser.WEBSITE_TITLE="Daraz Online Shopping";
                Intent myIntent=new Intent(Service_12.this,Web_browser.class);
                startActivity(myIntent);
            }
        });

        //=========//



    }










}