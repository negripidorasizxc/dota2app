package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class ItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);


        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        setContentView(R.layout.activity_items);
        CardView get = findViewById(R.id.cardGet);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(ItemsActivity.this,HomeActivity.class));
            }
        });


        CardView next = findViewById(R.id.cardNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(ItemsActivity.this,Items2Activity.class));
            }
        });

        CardView shard = findViewById(R.id.cardShard);
        shard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,ShardActivity.class));
            }
        });


        CardView bkb = findViewById(R.id.cardBkb);
        bkb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,BkbActivity.class));
            }
        });


        CardView pt = findViewById(R.id.cardPt);
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,PtActivity.class));
            }
        });

        CardView blink = findViewById(R.id.cardBlink);
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,BlinkActivity.class));
            }
        });

        CardView manta = findViewById(R.id.cardManta);
        manta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,MantaActivity.class));
            }
        });


        CardView radiance = findViewById(R.id.cardRadiance);
        radiance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,RadianceActivity.class));
            }
        });


        CardView hex = findViewById(R.id.cardHex);
        hex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,HexActivity.class));
            }
        });


        CardView agh = findViewById(R.id.cardAgh);
        agh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItemsActivity.this,AghActivity.class));
            }
        });

    }
}