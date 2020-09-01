package com.example.a7latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView charizard;
    ImageView corviknight;
    ImageView eternatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        charizard = (ImageView)findViewById(R.id.charizard);
        charizard.setOnClickListener(this);
        eternatus = (ImageView)findViewById(R.id.eternatus);
        eternatus.setOnClickListener(this);
        corviknight = (ImageView)findViewById(R.id.corviknight);
        corviknight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.charizard:
                Intent charizard = new Intent (MainActivity.this, CharizardActivity.class);
                startActivity(charizard);
                break;
            case R.id.corviknight:
                Intent corviknight = new Intent (MainActivity.this, CorviknightActivity.class);
                startActivity(corviknight);
                break;
            case R.id.eternatus:
                Intent eternatus = new Intent (MainActivity.this, EternatusActivity.class);
                startActivity(eternatus);
                break;
            default:
                break;
        }
    }
}