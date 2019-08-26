package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity implements View.OnClickListener {

    EditText EditTxtLK;
    Button BtnLK;
    TextView TxtHasilLK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        //inisialisasi
        EditTxtLK = (EditText) findViewById(R.id.EditTxtJari);
        BtnLK = (Button) findViewById(R.id.btnOkLK);
        TxtHasilLK = (TextView) findViewById(R.id.TxtHasilLK);

        BtnLK.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int jari;
        double hasil;
        double phi=3.14;
        if( view == BtnLK){
            jari = Integer.parseInt(EditTxtLK.getText().toString());
            hasil = 3.14*jari*jari;
            TxtHasilLK.setText(String.valueOf(hasil));
        }
    }
}
