package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeroesActivity extends AppCompatActivity {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);



        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        btn = findViewById(R.id.buttonGetBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,HomeActivity.class));
            }
        });

        btn = findViewById(R.id.buttonGetNext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,Heroes2Activity.class));
            }
        });

        CardView lycan = findViewById(R.id.cardLycan);
        lycan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,LycanActivity.class));
            }
        });


        CardView beast = findViewById(R.id.cardBeastmaster);
        beast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,BeastActivity.class));
            }
        });


        CardView alch = findViewById(R.id.cardAlchemist);
        alch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,AlchActivity.class));
            }
        });

        CardView mars = findViewById(R.id.cardMars);
        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,MarsActivity.class));
            }
        });

        CardView pudge = findViewById(R.id.cardPudge);
        pudge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,PudgeActivity.class));
            }
        });

        CardView cent = findViewById(R.id.cardCentaur);
        cent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,CentActivity.class));
            }
        });

        CardView timber = findViewById(R.id.cardTimber);
        timber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,TimberActivity.class));
            }
        });

        CardView dk = findViewById(R.id.cardDragon);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HeroesActivity.this,DragonActivity.class));
            }
        });


    }
}