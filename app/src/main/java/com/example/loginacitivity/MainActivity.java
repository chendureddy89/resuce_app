package com.example.loginacitivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton signupbtn = (MaterialButton) findViewById(R.id.signupbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("jaffa007") && password.getText().toString().equals("jaffa@007")){
                    // it should transfer to home page with
                    Toast.makeText(MainActivity.this,"Recognised User",Toast.LENGTH_SHORT).show();
                    opendummyhome();
                }
                else{
                    Toast.makeText(MainActivity.this,"Unrecognised User",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openregister(View view) {
        startActivity(new Intent(this,register.class));
    }
    public void opendummyhome() {
        startActivity(new Intent(this,dummyhome.class));
    }
}