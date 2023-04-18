package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Heroes2Activity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes2);


        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        btn = findViewById(R.id.buttonGetBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,HeroesActivity.class));
            }
        });

        btn = findViewById(R.id.buttonGetNext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,Heroes3Activity.class));
            }
        });

        CardView drow = findViewById(R.id.cardDrow);
        drow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,TrashActivity.class));
            }
        });


        CardView morph = findViewById(R.id.cardMorph);
        morph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,MorphActivity.class));
            }
        });

        CardView slark = findViewById(R.id.cardSlark);
        slark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,SlarkActivity.class));
            }
        });

        CardView naga = findViewById(R.id.cardNaga);
        naga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,NagaActivity.class));
            }
        });


        CardView lancer = findViewById(R.id.cardLancer);
        lancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,LancerActivity.class));
            }
        });

        CardView juggernaut = findViewById(R.id.cardJuggernaut);
        juggernaut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,JuggerActivity.class));
            }
        });


        CardView tb = findViewById(R.id.cardTerrorblade);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,TerrorbladeActivity.class));
            }
        });



        CardView am = findViewById(R.id.cardAntimage);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heroes2Activity.this,AmActivity.class));
            }
        });




    }
}