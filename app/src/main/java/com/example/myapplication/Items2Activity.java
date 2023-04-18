package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class Items2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items2);



        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        setContentView(R.layout.activity_items2);
        CardView get = findViewById(R.id.cardGet);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(Items2Activity.this,ItemsActivity.class));
            }
        });


        CardView next = findViewById(R.id.cardNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(Items2Activity.this,Items3Activity.class));
            }
        });


        CardView force = findViewById(R.id.cardForce);
        force.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,ForceActivity.class));
            }
        });


        CardView divine = findViewById(R.id.cardDivine);
        divine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,DivineActivity.class));
            }
        });

        CardView bm = findViewById(R.id.cardBlademail);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,BmActivity.class));
            }
        });

        CardView daed = findViewById(R.id.cardDaed);
        daed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,DaedActivity.class));
            }
        });

        CardView vg = findViewById(R.id.cardVang);
        vg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,VgActivity.class));
            }
        });

        CardView deso = findViewById(R.id.cardDeso);
        deso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,DesoActivity.class));
            }
        });

        CardView bash = findViewById(R.id.cardBash);
        bash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,BashActivity.class));
            }
        });

        CardView silver = findViewById(R.id.cardSilver);
        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Items2Activity.this,SilverActivity.class));
            }
        });

    }
}