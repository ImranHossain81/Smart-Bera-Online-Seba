package com.company.districtseba;

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
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Developer extends AppCompatActivity {


    ImageView back;
    CardView Call_me,linkdin;
    public String num="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        Call_me=findViewById(R.id.mycall);
        linkdin=findViewById(R.id.linkdin);


        back=findViewById(R.id.back_developer);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Developer.super.onBackPressed();

            }
        });

        Call_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num="01840084581";
                callPhoneNumber();
            }
        });


        linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Web_browser.WEBSITE_LINK="https://sites.google.com/diu.edu.bd/imrandiu681/about-me";
                Web_browser.WEBSITE_TITLE="Welcome To My Site";
                Intent myIntent=new Intent(Developer.this,Web_browser.class);
                startActivity(myIntent);

            }
        });


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
                    ActivityCompat.requestPermissions(Developer.this, new String[]{Manifest.permission.CALL_PHONE}, 101);
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

    //==================================================================================//
}