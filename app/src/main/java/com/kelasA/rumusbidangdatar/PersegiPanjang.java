package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity implements View.OnClickListener {

    EditText EditTxtPanjang,EditTxtLebar;
    Button BtnOkPP;
    TextView TxtHasilPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        //inisialisasi
        EditTxtPanjang = (EditText) findViewById(R.id.EditTxtPanjang);
        EditTxtLebar = (EditText) findViewById(R.id.EditTxtLebar);
        BtnOkPP = (Button) findViewById(R.id.btnOkPP);
        TxtHasilPP = (TextView) findViewById(R.id.TxtHasilPP);

        BtnOkPP.setOnClickListener(this);

    }

    @Override
   public void onClick(View view) {
        int panjang,lebar,hasil;
        if( view == BtnOkPP){
            panjang = Integer.parseInt(EditTxtPanjang.getText().toString());
            lebar = Integer.parseInt(EditTxtLebar.getText().toString());
            hasil = panjang*lebar;
            TxtHasilPP.setText(String.valueOf(hasil));
        }
    }
}
