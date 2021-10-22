package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
public Button gorevli;
public TextView sifreunuttum;
public TextView yenikayıtacma;
public Button menugiris;
public EditText girisnumarası;
public EditText girissifresi;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gorevli=findViewById(R.id.button3);
        sifreunuttum=findViewById(R.id.textView4);
        yenikayıtacma=findViewById(R.id.textView3);
        menugiris=findViewById(R.id.button2);
        girisnumarası=findViewById(R.id.editTextNumber2);
        girissifresi=findViewById(R.id.editTextTextPassword);
        rootNode=FirebaseDatabase.getInstance();
            menugiris.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 String x=girisnumarası.getText().toString();
                 String y=girissifresi.getText().toString();
                 reference=rootNode.getReference("Users");
                 reference.orderByChild("numara").equalTo(x).addListenerForSingleValueEvent(new ValueEventListener() {
                     @Override
                     public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                         if (datasnapshot.exists())
                         {
                             reference.orderByChild("sifre").equalTo(y).addListenerForSingleValueEvent(new ValueEventListener() {
                                 @Override
                                 public void onDataChange(@NonNull DataSnapshot snapshot) {
                                     if (snapshot.exists())
                                     {

                                         Intent yenimenu =new Intent(MainActivity.this,menusayfasi.class);
                                         startActivity(yenimenu);
                                     }
                                     else
                                     {
                                         Toast.makeText(getBaseContext(),"Sifreniz Hatalı ", Toast.LENGTH_SHORT).show();

                                     }
                                 }

                                 @Override
                                 public void onCancelled(@NonNull DatabaseError error) {

                                 }
                             });

                         }
                         else{

                             Toast.makeText(getBaseContext(),"Kullanıcı Adı Hatalı ",Toast.LENGTH_SHORT).show();
                         }
                     }

                     @Override
                     public void onCancelled(@NonNull DatabaseError error) {

                     }
                 });










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