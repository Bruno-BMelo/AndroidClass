package com.aula.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        View btn1 = findViewById(R.id.btn1p3);
        View btn2 = findViewById(R.id.btn2p3);
        View btn4 = findViewById(R.id.btn4p3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPage3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToPage3);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPage2 = new Intent(getApplicationContext(), Segundactivity.class);
                startActivity(goToPage2);
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