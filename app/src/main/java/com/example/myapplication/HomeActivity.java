    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

    public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();
        Toast.makeText(getApplicationContext(),"Добро пожаловать "+username,Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            }
        });

        CardView main = findViewById(R.id.cardMain);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MetaActivity.class));
            }
        });



        CardView guide = findViewById(R.id.cardGuide);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,SprActivity.class));
            }
        });


        CardView heroes = findViewById(R.id.cardHeroes);
        heroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,HeroesActivity.class));
            }
        });


        CardView training = findViewById(R.id.cardTraining);
        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,TrainingActivity.class));
            }
        });


        CardView items = findViewById(R.id.cardItems);
        items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,ItemsActivity.class));
            }
        });



    }
}