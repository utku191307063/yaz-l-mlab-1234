package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public Button gorevli;
public TextView sifreunuttum;
public TextView yenikayıtacma;
public Button menugiris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gorevli=findViewById(R.id.button3);
        sifreunuttum=findViewById(R.id.textView4);
        yenikayıtacma=findViewById(R.id.textView3);
        menugiris=findViewById(R.id.button2);
            menugiris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent yenimenu =new Intent(MainActivity.this,menusayfasi.class);
                    startActivity(yenimenu);
                }
            });
        yenikayıtacma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yenikayıtacılması =new Intent(MainActivity.this,yenikayit.class);
                startActivity(yenikayıtacılması);
            }
        });
        sifreunuttum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sifreunutulması =new Intent(MainActivity.this,sifremiunuttum.class);
                startActivity(sifreunutulması);
            }
        });
        gorevli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gorevlıgırıs =new Intent(MainActivity.this,gorevligiris.class);
                startActivity(gorevlıgırıs);
            }
        });


    }
}