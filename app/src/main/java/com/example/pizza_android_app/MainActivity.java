package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eid,pword;
    Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String Username="abc123@gmail.com";
        final String Password="12345678";
        eid=(EditText)findViewById(R.id.eid);
        pword=(EditText)findViewById(R.id.pword);
        login=(Button)findViewById(R.id.login);
        signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((eid.getText().toString().equalsIgnoreCase(Username)) && (pword.getText().toString().equalsIgnoreCase(Password))){
                    Intent intent = new Intent(MainActivity.this,menu.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter Correct Username/Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
