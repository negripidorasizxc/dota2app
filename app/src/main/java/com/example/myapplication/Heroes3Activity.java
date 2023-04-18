package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Heroes3Activity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes3);


        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        btn = findViewById(R.id.buttonGetBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,Heroes2Activity.class));
            }
        });


        CardView tinker = findViewById(R.id.cardTinker);
        tinker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,TinkerActivity.class));
            }
        });


        CardView muerta = findViewById(R.id.cardMuerta);
        muerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,MuertaActivity.class));
            }
        });

        CardView rubick = findViewById(R.id.cardRubick);
        rubick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,RubickActivity.class));
            }
        });

        CardView chen = findViewById(R.id.cardChen);
        chen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,ChenActivity.class));
            }
        });


        CardView bane = findViewById(R.id.cardBane);
        bane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,BaneActivity.class));
            }
        });


        CardView zeus = findViewById(R.id.cardZeus);
        zeus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,ZeusActivity.class));
            }
        });

        CardView puck = findViewById(R.id.cardPuck);
        puck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,PuckActivity.class));
            }
        });


        CardView ench = findViewById(R.id.cardEnch);
        ench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes3Activity.this,EnchActivity.class));
            }
        });


    }
}