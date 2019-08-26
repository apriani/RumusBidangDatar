package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BujurSangkar extends AppCompatActivity implements View.OnClickListener {
    EditText EditTxtPS;
    Button BtnBS;
    TextView TxtHasilBS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);

        //inisialisasi
        EditTxtPS = (EditText) findViewById(R.id.EditTxtSisi);
        BtnBS = (Button) findViewById(R.id.btnOkBS);
        TxtHasilBS = (TextView) findViewById(R.id.TxtHasilBS);

        BtnBS.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int sisi,hasil;
        if( view == BtnBS){
            sisi = Integer.parseInt(EditTxtPS.getText().toString());
            hasil = sisi*sisi;
            TxtHasilBS.setText(String.valueOf(hasil));
        }
    }
}
