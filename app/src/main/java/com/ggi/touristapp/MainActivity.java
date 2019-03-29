package com.ggi.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rashtra = (TextView) findViewById(R.id.rashTextView);
        rashtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, rashtrapati.class);
                startActivity(i);
            }
        });

        TextView qutub = (TextView) findViewById(R.id.qutub);
        qutub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, qutub.class);
                startActivity(i);
            }
        });

        TextView redfort = (TextView) findViewById(R.id.redfortTextView);
        redfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, redfort.class);
                startActivity(i);
            }
        });

        TextView indiagate = (TextView) findViewById(R.id.indiagate);
        indiagate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, indiagate.class);
                startActivity(i);
            }
        });
    }
}
