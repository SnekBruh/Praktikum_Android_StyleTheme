package com.example.viewviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Redmi Note 8 PRO");
        }
        Button buy = findViewById(R.id.buy);
        buy.setOnClickListener(this);
        Button cscall = findViewById(R.id.cscall);
        cscall.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buy:
                Intent moveIntent = new Intent(MainActivity.this, move_activity.class);
                startActivity(moveIntent);
                break;
            case R.id.cscall:
                String phoneNumber = "0822984898810";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
