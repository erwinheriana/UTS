package com.example.agussantoso.njajal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static String judul;
    public static String isi;

    public TextView tvJudul, tvIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyFirebaseMessagingService ambilToken = new MyFirebaseMessagingService();

        ambilToken.onTokenRefresh();

        tvJudul = (TextView) findViewById(R.id.tvTitle);
        tvIsi = (TextView) findViewById(R.id.tvBody);
        if (judul != null || isi != null) {
            tvJudul.setText(judul);
            tvIsi.setText(isi);
        }
    }
}