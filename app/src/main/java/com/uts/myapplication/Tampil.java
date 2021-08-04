package com.uts.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tampil extends AppCompatActivity {

    private Button btnTampil;
    private EditText inputName;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        textView = (TextView) findViewById(R.id.textView);
        inputName = (EditText) findViewById(R.id.inputName);
        btnTampil = (Button) findViewById(R.id.tampil);

        getSupportActionBar().setTitle("Tampil Data");

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Halo, " + inputName.getText());
            }
        });

    }
}