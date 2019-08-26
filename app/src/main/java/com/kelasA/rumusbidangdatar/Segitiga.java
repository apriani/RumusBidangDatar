package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity implements View.OnClickListener {

    EditText EditTxtAlas,EditTxtTinggi;
    Button BtnOkST;
    TextView TxtHasilST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        //inisialisasi
        EditTxtAlas= (EditText) findViewById(R.id.EditTxtAlas);
        EditTxtTinggi = (EditText) findViewById(R.id.EditTxtTinggi);
        BtnOkST = (Button) findViewById(R.id.btnOkST);
        TxtHasilST = (TextView) findViewById(R.id.TxtHasilST);

        BtnOkST.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int alas,tinggi;
        double hasil;
        if( view == BtnOkST){
            alas = Integer.parseInt(EditTxtAlas.getText().toString());
            tinggi = Integer.parseInt(EditTxtTinggi.getText().toString());
            hasil = alas*tinggi*0.5;
            TxtHasilST.setText(String.valueOf(hasil));
        }
    }
}
