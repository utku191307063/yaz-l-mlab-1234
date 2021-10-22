package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menusayfasi extends AppCompatActivity {
public Button yazokulu;
public Button cap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusayfasi);
        yazokulu=findViewById(R.id.button9);
        yazokulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yazokulusayfasi =new Intent(menusayfasi.this,yazokulubasvuru.class);
                startActivity(yazokulusayfasi);
            }
        });
        cap=findViewById(R.id.button11);
        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent capsasyfası = new Intent(menusayfasi.this,capformu.class);
                startActivity(capsasyfası);
            }
        });


    }
}