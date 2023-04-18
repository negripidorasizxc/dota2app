package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;



public class RegisterActivity extends AppCompatActivity {

    EditText edUserName, edEmail, edPassword, edConfirm;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edUserName = findViewById(R.id.editTextRegUsername);
        edPassword = findViewById(R.id.editTextRegPassword);
        edEmail = findViewById(R.id.editTextRegEmail);
        edConfirm = findViewById(R.id.editTextRegConfirmPassword);
        btn = findViewById(R.id.buttonRegister);
        tv = findViewById(R.id.textViewExistingUser);


        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUserName.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                String confirm = edConfirm.getText().toString();
                Database db = new Database(getApplicationContext(), "Dota Helper", null, 1);

                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirm.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Заполните данные", Toast.LENGTH_SHORT).show();
                } else {

                    if (password.compareTo(confirm) == 0) {
                        db.register(username,email,password);
                        Toast.makeText(getApplicationContext(), "Регистрация завершена", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    }

                }
            }
        });
    }
}
