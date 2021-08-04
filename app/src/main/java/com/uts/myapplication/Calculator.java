package com.uts.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button plus;
    private Button minus;
    private Button times;
    private Button divide;
    private Button clear;
    private EditText bil1;
    private EditText bil2;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        bil1 = (EditText) findViewById(R.id.inputBil1);
        bil2 = (EditText) findViewById(R.id.inputBil2);
        hasil = (TextView) findViewById(R.id.hasil);

        plus = (Button) findViewById(R.id.plus);

        getSupportActionBar().setTitle("Kalkulator");

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText(Double.toString(Double.parseDouble(bil1.getText().toString()) + Double.parseDouble(bil2.getText().toString())));
            }
        });

        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText(Double.toString(Double.parseDouble(bil1.getText().toString()) - Double.parseDouble(bil2.getText().toString())));
            }
        });


        times = (Button) findViewById(R.id.times);
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText(Double.toString(Double.parseDouble(bil1.getText().toString()) * Double.parseDouble(bil2.getText().toString())));
            }
        });

        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText(Double.toString(Double.parseDouble(bil1.getText().toString()) / Double.parseDouble(bil2.getText().toString())));
            }
        });

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bil1.setText("");
                bil2.setText("");
            }
        });
    }
}