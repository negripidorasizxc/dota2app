package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrainingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);


        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "").toString();


        CardView exit = findViewById(R.id.cardGetBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(TrainingActivity.this,HomeActivity.class));
            }
        });

        CardView step1 = findViewById(R.id.cardStep1);
        step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TrainingActivity.this,Step1Activity.class));
            }
        });


        CardView step2 = findViewById(R.id.cardStep2);
        step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TrainingActivity.this,Step2Activity.class));
            }
        });


        CardView step3 = findViewById(R.id.cardStep3);
        step3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TrainingActivity.this,Step3Activity.class));
            }
        });


        CardView step4 = findViewById(R.id.cardStep4);
        step4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TrainingActivity.this,Step4Activity.class));
            }
        });


    }
}