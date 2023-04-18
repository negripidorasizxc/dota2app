package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        setContentView(R.layout.activity_meta);
        CardView back = findViewById(R.id.cardBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(MetaActivity.this,HomeActivity.class));
            }
        });

        CardView slark = findViewById(R.id.cardSlark);
        slark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,SlarkActivity.class));
            }
        });

        CardView trash = findViewById(R.id.cardDrow);
        trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,TrashActivity.class));
            }
        });

        CardView lycan = findViewById(R.id.cardLycan);
        lycan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,LycanActivity.class));
            }
        });


        CardView beast = findViewById(R.id.cardBeastmaster);
        beast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,BeastActivity.class));
            }
        });


        CardView rubick = findViewById(R.id.cardRubick);
        rubick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,RubickActivity.class));
            }
        });


        CardView morph = findViewById(R.id.cardMorph);
        morph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,MorphActivity.class));
            }
        });

        CardView tinker = findViewById(R.id.cardTinker);
        tinker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,TinkerActivity.class));
            }
        });

        CardView naga = findViewById(R.id.cardNaga);
        naga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,NagaActivity.class));
            }
        });


        CardView muerta = findViewById(R.id.cardMuerta);
        muerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MetaActivity.this,MuertaActivity.class));
            }
        });

    }
}