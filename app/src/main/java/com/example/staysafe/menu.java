package com.example.staysafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.Manifest;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.pm.PackageManager;
import android.support.v4.app.INotificationSideChannel;

public class menu extends AppCompatActivity {
    Button btn;
    EditText numtxt;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Sanitize:
                Toast.makeText(this, "More To Sanitizing", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.masks:
                Toast.makeText(this, "Ideal In masks", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.distancing:
                Toast.makeText(this, "More to social Distance", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.StayHome:
                Toast.makeText(this, "More in Staying Home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Go_For_Jab:
                Toast.makeText(this, "Benefits In Getting A Jab", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}