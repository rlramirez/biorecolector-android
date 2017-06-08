package com.example.utpl.biorecolector;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listar extends AppCompatActivity {
    ListView lista;
    String[] valores = new String[]{"Muestra 01","Muestra 02","Muestra 03","Muestra 04","Muestra 05","Muestra 06","Muestra 07","Muestra 08"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //setContentView(R.layout.listar);


        ArrayAdapter<String> adaptador;

        lista = (ListView)findViewById(R.id.listado);

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, valores);

        lista.setAdapter(adaptador);

        //Evento que se disparará al pulsar en un elemento de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView< ?> arg0, View arg1, int arg2,
                                    long arg3) {

                ListAdapter la = (ListAdapter) arg0.getAdapter();

                Toast.makeText(
                        arg1.getContext()
                        ,la.getItem(arg2).toString()
                        ,Toast.LENGTH_LONG)
                        .show();

            };
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(listar.this,nuevo.class);
                startActivityForResult(intent,0);
            }
        });
    }

}
