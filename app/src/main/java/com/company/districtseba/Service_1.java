package com.company.districtseba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

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

public class Service_1 extends AppCompatActivity {

    AdView mAdView;
    InterstitialAd mInterstitialAd;

    ImageView back1,back2,back3;
    CardView News1,News2,News3,News8,News5,News9,News10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service1);

        News1=findViewById(R.id.News1);
        News2=findViewById(R.id.News2);
        News3=findViewById(R.id.News3);
        News8=findViewById(R.id.News8);
        /*News9=findViewById(R.id.News9);*/
        News10=findViewById(R.id.News10);
        News5=findViewById(R.id.firstnews);
        mAdView=findViewById(R.id.adView);

        mAdView.setVisibility(View.GONE);


        back1=findViewById(R.id.back1);
         back1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Service_1.super.onBackPressed();

             }
         });


/*
  //========Ads start====


        //init Mobile Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



       String url="https://clientcontrol123.blogspot.com/2022/10/blog-post.html";
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);


// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        if (response.contains("ON")){

                            loadFullscreenAd();
                            loadBannerAd();
                        } else {

                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);


 */



        //=========news open======//

        News1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.protidinersangbad.com/";
                Web_browser.WEBSITE_TITLE="প্রতিদিনের সংবাদ";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.prothomalo.com/topic/%E0%A6%AC%E0%A7%87%E0%A7%9C%E0%A6%BE";
                Web_browser.WEBSITE_TITLE="প্রথম আলো";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
        News3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.dainikamadershomoy.com/post/347528";
                Web_browser.WEBSITE_TITLE="আমাদের সময়";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });



        News8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.bd-pratidin.com/country/2020/10/12/576094";
                Web_browser.WEBSITE_TITLE="বাংলাদেশ প্রতিদিন";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });



        News5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://dailyprothomsangbad24.com/";
                Web_browser.WEBSITE_TITLE="প্রথম সংবাদ";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });

/*
        News9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://razibofficial.blogspot.com/?m=1";
                Web_browser.WEBSITE_TITLE="লাইভ নিউজ";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });
*/

        News10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web_browser.WEBSITE_LINK="https://www.muktoalo24.com/";
                Web_browser.WEBSITE_TITLE="মুক্ত আলোর পথে সত্যের সন্ধান";
                Intent myIntent=new Intent(Service_1.this,Web_browser.class);
                startActivity(myIntent);
            }
        });

        //==============================end===============================================//


    }


    //==============================================Banner ad start=============================//

    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //============================================banner ebd==============================//





    // loadFullscreenAd method starts here.....
    int FULLSCREEN_AD_LOAD_COUNT=0;
    public void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        FULLSCREEN_AD_LOAD_COUNT++;
                        loadFullscreenAd();
                        Log.d("FULLSCREEN_AD", ""+FULLSCREEN_AD_LOAD_COUNT);

                        // None of the above is true. So the category is video collection type


                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>










    //=========================onBackPressed ads show======================================//
    @Override
    public void onBackPressed() {

        if (mInterstitialAd != null) {
            mInterstitialAd.show(Service_1.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    Service_1.super.onBackPressed();
                }
            });
        } else {

            super.onBackPressed();

        }



    }

    //=======================onBAckpressed ads show End=======================================//


}