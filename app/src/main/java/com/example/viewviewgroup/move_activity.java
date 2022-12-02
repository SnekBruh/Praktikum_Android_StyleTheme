package com.example.viewviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class move_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Konfirmasi Pembelian");
        }
    }
}