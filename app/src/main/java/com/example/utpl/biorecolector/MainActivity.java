package com.example.utpl.biorecolector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_listar, btn_nuevo, btn_sinc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_nuevo=(Button) findViewById(R.id.bt1);
        btn_listar=(Button) findViewById(R.id.bt3);
        btn_sinc=(Button) findViewById(R.id.bt2);

        btn_nuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,nuevo.class);
                startActivityForResult(intent,0);
            }
        });
        btn_listar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,listar.class);
                startActivityForResult(intent,0);
            }
        });
        btn_sinc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,sincronizar.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
