package com.kelasA.rumusbidangdatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton BtnBS,BtnLK,BtnPP,BtnST,BtnJG,BtnAbout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnBS = (ImageButton) findViewById(R.id.btnBS);
        BtnLK = (ImageButton) findViewById(R.id.btnLK);
        BtnPP = (ImageButton) findViewById(R.id.btnPP);
        BtnST = (ImageButton) findViewById(R.id.btnST);
        BtnJG = (ImageButton) findViewById(R.id.btnJG);
        BtnAbout = (ImageButton) findViewById(R.id.btnAbout);

        BtnBS.setOnClickListener(this);
        BtnLK.setOnClickListener(this);
        BtnPP.setOnClickListener(this);
        BtnST.setOnClickListener(this);
        BtnJG.setOnClickListener(this);
        BtnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if ( view == BtnBS){
            Intent i =new Intent(getApplicationContext(), BujurSangkar.class);
            startActivity(i);
        } else if ( view == BtnLK){
            Intent i =new Intent(getApplicationContext(), Lingkaran.class);
            startActivity(i);
        }else if ( view == BtnPP){
            Intent i =new Intent(getApplicationContext(), PersegiPanjang.class);
            startActivity(i);
        } else if ( view == BtnST) {
            Intent i = new Intent(getApplicationContext(), Segitiga.class);
            startActivity(i);
        }else if ( view == BtnJG){
            Intent i =new Intent(getApplicationContext(), JajaranGenjang.class);
            startActivity(i);
        } else if ( view == BtnAbout) {
            Intent i = new Intent(getApplicationContext(), About.class);
            startActivity(i);
        }
    }
}

