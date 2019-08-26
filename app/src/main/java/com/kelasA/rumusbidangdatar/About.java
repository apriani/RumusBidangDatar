package com.kelasA.rumusbidangdatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class About extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btn = (Button) findViewById(R.id.btnOkAbout);
        image = (ImageView) findViewById(R.id.ImageView1);


        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if( view == btn){
            image.setImageResource(R.drawable.valkhan);
        }
    }
}
