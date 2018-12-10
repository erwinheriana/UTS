package com.example.agussantoso.njajal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro extends AppCompatActivity  {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button btn1 =(Button)findViewById(R.id.btnNext);

        Button btn2 =(Button)findViewById(R.id.btnVidio);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(intro.this,MainActivity.class);
                startActivity(pindah);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent vidio = new Intent(intro.this,MainActivity_Video.class);
                startActivity(vidio);

            }
        });

    }

}
