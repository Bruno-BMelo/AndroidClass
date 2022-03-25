package com.aula.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Segundactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundactivity);

        View btn1 = findViewById(R.id.btn1p2);
        View btn3 = findViewById(R.id.btn3p2);
        View btn4 = findViewById(R.id.btn4p2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPage2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToPage2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPage3 = new Intent(getApplicationContext(), TerceiraActivity.class);
                startActivity(goToPage3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPage4 = new Intent(getApplicationContext(), QuartaActivity.class);
                startActivity(goToPage4);
            }
        });

    }
}