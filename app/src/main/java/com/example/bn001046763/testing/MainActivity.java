package com.example.bn001046763.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but1, but2, but3, but4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = (Button) findViewById(R.id.add);
        but1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Addition.class);
                startActivityForResult(myIntent, 0);
            }
        });

        but2 = (Button) findViewById(R.id.multi);
        but2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Multiplication.class);
                startActivityForResult(myIntent, 0);
            }
        });

        but3 = (Button) findViewById(R.id.div);
        but3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Division.class);
                startActivityForResult(myIntent, 0);
            }
        });

        but4 = (Button) findViewById(R.id.min);
        but4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Subtraction.class);
                startActivityForResult(myIntent, 0);
            }
        });
}}
