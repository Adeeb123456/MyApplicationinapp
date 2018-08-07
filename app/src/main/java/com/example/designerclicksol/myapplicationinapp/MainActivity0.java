package com.example.designerclicksol.myapplicationinapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;




public class MainActivity0 extends AppCompatActivity {
MyBilling myBilling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        myBilling=new MyBilling(this);
        myBilling.onCreate();

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        myBilling.onActivityResult(requestCode,resultCode,data);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        myBilling.onDestroy();
    }

    public void removeAds(View view){
        myBilling.purchaseRemoveAds();
    }
}
