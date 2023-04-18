package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class Items3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items3);



        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();

        setContentView(R.layout.activity_items3);
        CardView get = findViewById(R.id.cardGet);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(Items3Activity.this,Items2Activity.class));
            }
        });



        CardView tango = findViewById(R.id.cardTango);
        tango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,TangoActivity.class));
            }
        });


        CardView kaya = findViewById(R.id.cardKaya);
        kaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,KayaActivity.class));
            }
        });


        CardView satanic = findViewById(R.id.cardSatanic);
        satanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,SatanicActivity.class));
            }
        });


        CardView skadi = findViewById(R.id.cardSkadi);
        skadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,SkadiActivity.class));
            }
        });


        CardView crystalys = findViewById(R.id.cardCrystalys);
        crystalys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,CrystalysActivity.class));
            }
        });


        CardView fly = findViewById(R.id.cardFly);
        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,BfActivity.class));
            }
        });


        CardView shiva = findViewById(R.id.cardShiva);
        shiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,ShivaActivity.class));
            }
        });


        CardView mael = findViewById(R.id.cardMael);
        mael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,MaelActivity.class));
            }
        });



        CardView dagon = findViewById(R.id.cardDagon);
        dagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items3Activity.this,DagonActivity.class));
            }
        });
    }
}