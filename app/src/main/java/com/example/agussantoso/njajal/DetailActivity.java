package com.example.agussantoso.njajal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CeritaDetailFragment frag =(CeritaDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        Bundle Mlebu = getIntent().getExtras();

        frag.setResep(Mlebu.getLong("id"));

        Button btn1 =(Button)findViewById(R.id.btn_komentar);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(DetailActivity.this,Library.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });
    }
}
