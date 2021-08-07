package com.example.staysafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText Name;
private TextView info;
private EditText password;
private Button Login;
private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etPassword);
        info = (TextView) findViewById(R.id.tvinfo);
        Login = (Button) findViewById(R.id.btnLogin);
        info.setText("number of attemps remaining: 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),password.getText().toString());
            }
        });
    }
    private void validate (String username,String userpassword){
        if ((username=="admin") && (userpassword=="1234")){
            Intent intent=new Intent(MainActivity.this,menu.class);
            startActivity(intent);
        }else{
            counter--;
            info.setText("number of attemps remaining"+String.valueOf(counter));

            if (counter==0){
                Login.setEnabled(false);
            }
        }
    }
}