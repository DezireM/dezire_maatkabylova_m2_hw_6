package com.example.secondapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PrivilegedAction;

public class MainActivity extends AppCompatActivity {

    private TextView Entrance;
    private TextView Registration;
    private TextView SecondR;
    private TextView YrPassword;
    private TextView ClickP;
    private EditText Email;
    private EditText EnterP;
    private Button Come;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SecondR = findViewById(R.id.tv_registration2);
      Entrance = findViewById(R.id.tv_entrance);
      Email = findViewById(R.id.email);
      Registration = findViewById(R.id.tv_registration);
      YrPassword = findViewById(R.id.yrPassword);
      ClickP = findViewById(R.id.clickP);
      EnterP = findViewById(R.id.passowrd);
      Come = findViewById(R.id.btnCome);
      YrPassword.addTextChangedListener(new TextWatcher() {
          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {

          }

          @Override
          public void onTextChanged(CharSequence s, int start, int before, int count) {

          }

          @Override
          public void afterTextChanged(Editable s) {
              if (YrPassword.getText().toString().isEmpty()){
                  Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));

              }else {
                  Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));


              }

          }
      });

      Email.addTextChangedListener(new TextWatcher() {
          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {

          }

          @Override
          public void onTextChanged(CharSequence s, int start, int before, int count) {

          }

          @Override
          public void afterTextChanged(Editable s) {
              if (Email.getText().toString().isEmpty()){
                  Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));

              }else {
                  Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
              }
          }
      });
      Come.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (Email.getText().toString().equals("admin")&& EnterP.getText().toString().equals("admin")){
                  Entrance.setVisibility(View.GONE);
                  Registration.setVisibility(View.GONE);
                  SecondR.setVisibility(View.GONE);
                  YrPassword.setVisibility(View.GONE);
                  ClickP.setVisibility(View.GONE);
                  Email.setVisibility(View.GONE);
                  EnterP.setVisibility(View.GONE);
                  Come.setVisibility(View.GONE);
                  Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT).show();
              } else {
                  Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_SHORT).show();

              }
          }
      });
    }
}