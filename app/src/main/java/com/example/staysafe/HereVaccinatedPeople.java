package com.example.staysafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ImageButton;

public abstract class HereVaccinatedPeople extends AppCompatActivity {
    ImageButton imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_here_vaccinated_people);
        imageview = findViewById(R.id.imageButton);
    }

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

public void onImageClick(View v){
    Toast.makeText(this, "Clicked How far", Toast.LENGTH_SHORT).show();
}
}