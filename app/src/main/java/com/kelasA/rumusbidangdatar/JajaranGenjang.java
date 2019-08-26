package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajaranGenjang extends AppCompatActivity implements View.OnClickListener {

    EditText EditTxtAlasJG,EditTxtTinggiJG;
    Button BtnOkJG;
    TextView TxtHasilJG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajaran_genjang);

        //inisialisasi
        EditTxtAlasJG= (EditText) findViewById(R.id.EditTxtAlasJG);
        EditTxtTinggiJG = (EditText) findViewById(R.id.EditTxtTinggiJG);
        BtnOkJG = (Button) findViewById(R.id.btnOkJG);
        TxtHasilJG = (TextView) findViewById(R.id.TxtHasilJG);

        BtnOkJG.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int alas,tinggi;
        double hasil;
        if( view == BtnOkJG){
            alas = Integer.parseInt(EditTxtAlasJG.getText().toString());
            tinggi = Integer.parseInt(EditTxtTinggiJG.getText().toString());
            hasil = alas*tinggi;
            TxtHasilJG.setText(String.valueOf(hasil));
        }
    }
}
