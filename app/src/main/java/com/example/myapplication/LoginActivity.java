package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class LoginActivity extends AppCompatActivity {


    EditText edUserName, edPassword;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edUserName = findViewById(R.id.editTextLoginUsername);
        edPassword = findViewById(R.id.editTextLoginPassword);
        btn = findViewById(R.id.buttonLogin);
        tv = findViewById(R.id.textViewNewUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUserName.getText().toString();
                String password = edPassword.getText().toString();
                Database db = new Database(getApplicationContext(), "Dota Helper", null, 1);
                if (username.length() == 0 || password.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Заполните данные", Toast.LENGTH_SHORT).show();
                } else {
                    if(db.login(username,password)==1)  {
                        Toast.makeText(getApplicationContext(), "Вход в систему", Toast.LENGTH_SHORT).show();

                        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username",username);
                        editor.apply();

                        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }
}