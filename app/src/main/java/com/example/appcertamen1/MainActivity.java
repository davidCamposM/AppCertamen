package com.example.appcertamen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtIngresoItem1, txtIngresoItem2, txtIngresoItem3;
    ListView lista;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIngresoItem1 = findViewById(R.id.txtIngreso1);
        txtIngresoItem2 = findViewById(R.id.txtIngreso2);
        txtIngresoItem3 = findViewById(R.id.txtIngreso3);
        //ListView
        lista = findViewById(R.id.listVieww);
        items = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        //Setteamos el adapter
        lista.setAdapter(adapter);
    }

    public void agregarItem (View view)
    {

    }
}