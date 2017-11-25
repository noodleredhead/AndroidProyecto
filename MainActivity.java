package com.example.alondra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button abrirAct;
    Button abrirActDos;
    Button abrirActTres;
    Button abrirActCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abrirAct = (Button) findViewById(R.id.abrirActividad);
        abrirActDos = (Button) findViewById(R.id.abrirActividadDos);
        abrirActTres = (Button) findViewById(R.id.abrirActividadTres);
        abrirActCuatro = (Button) findViewById(R.id.abrirActividadCuatro);


        abrirAct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent Main2Activity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(Main2Activity);
            }
        });
        abrirActDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent Main3Activity = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(Main3Activity);
            }
        });
        abrirActTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent Main4Activity = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(Main4Activity);
            }
        });
        abrirActCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent Main5Activity = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(Main5Activity);
            }
        });
    }


}
