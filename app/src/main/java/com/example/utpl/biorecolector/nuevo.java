package com.example.utpl.biorecolector;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nuevo extends AppCompatActivity {
    EditText NOMBRE,COLOR,
            TURBIEDAD,PH,
            TEMPERATURA,CONDUCTIVIDAD,
            STD,ALUMINIO,
            COBRE,CLORO,
            FOSFATOS,FLUORUROS,
            HIERRO,MANGANESO,
            NITRATOS,NITRITOS,NITROGENO;
    Button btnAgregar, read_bt;
    SQLControlador dbconeccion;
    public String formatteDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        COLOR = (EditText) findViewById(R.id.txtcolor);
        TURBIEDAD = (EditText) findViewById(R.id.txtcolor);
        PH = (EditText) findViewById(R.id.txtcolor);
        TEMPERATURA = (EditText) findViewById(R.id.txtcolor);
        CONDUCTIVIDAD = (EditText) findViewById(R.id.txtcolor);
        STD = (EditText) findViewById(R.id.txtcolor);
        ALUMINIO = (EditText) findViewById(R.id.txtcolor);
        COBRE = (EditText) findViewById(R.id.txtcolor);
        CLORO = (EditText) findViewById(R.id.txtcolor);
        FOSFATOS = (EditText) findViewById(R.id.txtcolor);
        FLUORUROS = (EditText) findViewById(R.id.txtcolor);
        HIERRO = (EditText) findViewById(R.id.txtcolor);
        MANGANESO = (EditText) findViewById(R.id.txtcolor);
        NITRATOS = (EditText) findViewById(R.id.txtcolor);
        NITRITOS = (EditText) findViewById(R.id.txtcolor);
        NITROGENO = (EditText) findViewById(R.id.txtcolor);
        btnAgregar = (Button) findViewById(R.id.bt5);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(nuevo.this,nuevo.class);
                startActivityForResult(intent,0);
            }
        });
    }

}
