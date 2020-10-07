package com.example.bt2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.Date;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Button btn = (Button) findViewById(R.id.button);
        final Button btnNext = (Button) findViewById(R.id.next);
        final Button btnBack = (Button) findViewById(R.id.back);
        final AlertDialog ad = new AlertDialog.Builder(this).create();

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Date t = new Date();
                String message = "Thoi gian hien hanh" + t.toLocaleString();
                ad.setMessage(message);
                ad.show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}