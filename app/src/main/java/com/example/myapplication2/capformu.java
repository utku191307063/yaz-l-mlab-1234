package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class capformu extends AppCompatActivity {
public Button yonetmelikbutonu ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capformu);
        yonetmelikbutonu=findViewById(R.id.button8);
        yonetmelikbutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yonetmelik =new Intent(capformu.this,capyonetmelik.class);
                startActivity(yonetmelik);
            }
        });
    }
}