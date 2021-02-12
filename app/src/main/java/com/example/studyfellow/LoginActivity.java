package com.example.studyfellow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button login_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
        login_bt = findViewById(R.id.login_btn);

        login_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    public void Login(){
       GetInfo();
    }

    public void GetInfo(){
        String Username = username.getText().toString();
        String Password = password.getText().toString();

      Log.d("Username ->>>>>>>",Username);
      Log.d("Password->>>>>>>>",Password);

  }
}