package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class yenikayit extends AppCompatActivity {
 EditText adı,soyadı,numarası,maili,adresi,telnumarasi,tc,sifre;
 Button kayıtol;
FirebaseDatabase rootNode ;
DatabaseReference reference ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yenikayit);
        adı=findViewById(R.id.editTextTextPersonName2);
        soyadı=findViewById(R.id.editTextTextPersonName3);
        numarası=findViewById(R.id.editTextNumber5);
        maili=findViewById(R.id.editTextTextEmailAddress);
        adresi=findViewById(R.id.editTextTextPostalAddress);
        telnumarasi=findViewById(R.id.editTextPhone);
        tc=findViewById(R.id.editTextNumber6);
        kayıtol=findViewById(R.id.button6);
        sifre=findViewById(R.id.editTextTextPersonName4);

        kayıtol.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               rootNode = FirebaseDatabase.getInstance();
               reference= rootNode.getReference("Users");
               String Ad = adı.getEditableText().toString();
               String Soyad = soyadı.getEditableText().toString();
               String Numara = numarası.getEditableText().toString();
               String Tc = tc.getEditableText().toString();
               String Adres = adresi.getEditableText().toString();
               String Maili = maili.getEditableText().toString();
               String Telnumarasi = telnumarasi.getEditableText().toString();
               String Sifre = sifre.getEditableText().toString();
               kayıtekleme kayıteklee = new kayıtekleme(Ad,Soyad,Numara,Tc,Adres,Maili,Telnumarasi,Sifre);
               reference.child(Numara).setValue(kayıteklee);
               Intent yenikısı =new Intent(yenikayit.this,MainActivity.class);
               startActivity(yenikısı);

           }
       });
    }
}