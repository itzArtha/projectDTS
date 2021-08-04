package com.uts.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {

    private ListView lv;
    private String[] namanegara = new String[]{"Indonesia", "Singapura", "Vietnam", "Japan", "Amerika"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setTitle("List View");

        lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(List.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(List.this, "Memilih : " + namanegara[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}