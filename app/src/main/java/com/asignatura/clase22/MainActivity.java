package com.asignatura.clase22;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{

    Button guardar , actualizar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignacion de valores

        guardar = (Button) findViewById(R.id.btnGuardar);
        actualizar = (Button) findViewById(R.id.btnActualizar);

        /// Implementacion de OnClickListener (su click rapido)///
        guardar.setOnClickListener(this);
        actualizar.setOnClickListener(this);

        /// Implementacion de OnLongClickListener (se deja apretado el boton un rato) ///
        guardar.setOnLongClickListener(this);
        actualizar.setOnLongClickListener(this);

    }


    @Override
    public void onClick(View v) {
        //identifica una vista (v) y lo busca por su id (v.getId)
        switch (v.getId()) {
            case R.id.btnGuardar:
                Toast.makeText(getApplicationContext(), "su toast guardar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnActualizar:
                Toast.makeText(getApplicationContext(), "su toast actualizar", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public boolean onLongClick(View v) {

        switch (v.getId()) {
            case R.id.btnGuardar:
                Toast.makeText(getApplicationContext(), "su toast guardar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnActualizar:
                Toast.makeText(getApplicationContext(), "su toast actualizar", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}