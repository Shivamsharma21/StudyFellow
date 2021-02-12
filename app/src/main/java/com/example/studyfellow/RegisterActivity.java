package com.example.studyfellow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

     TextView reg_Login; //refers to already have an account//
     Button Register_btn;
     EditText Name,Address,Phone,Email,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Initilizer();
        reg_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
      Register_btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              RegisternewUser();
          }
      });

    }

   public void RegisternewUser(){

   }
   void Initilizer(){
       Register_btn = findViewById(R.id.reg_btn);
       reg_Login = findViewById(R.id.login_already_acc);
       Name = findViewById(R.id.registerPersonName);
       Address = findViewById(R.id.registerPersoneaddress);
       Password = findViewById(R.id.editTextPassword);
       Email = findViewById(R.id.registerPersonemail);
       Phone = findViewById(R.id.registerPersonnumber);
    }
}