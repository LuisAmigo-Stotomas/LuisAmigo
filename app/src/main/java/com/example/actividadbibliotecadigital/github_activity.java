package com.example.actividadbibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class github_activity extends AppCompatActivity {

    private Spinner spinnerPaso;
    private TextView textViewPaso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_activity);


        spinnerPaso = (Spinner) findViewById(R.id.idSelectorLibros);

        String[] libros = {"Seleccione Libros", "Farenheith", "Revival", "El Alquimista", "El Poder", "Despertar"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, libros);

        spinnerPaso.setAdapter(adapt);

        textViewPaso = (TextView)findViewById(R.id.idTextViewLibros);

        spinnerPaso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desplegarLibros();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void desplegarLibros() {


        if (spinnerPaso.getSelectedItem().toString().equals("Farenheith")) {
            textViewPaso.setText("El valor de " + spinnerPaso.getSelectedItem().toString() + " es de : 7000 ");
        }

        if (spinnerPaso.getSelectedItem().toString().equals("Revival")) {
            textViewPaso.setText("El valor de " + spinnerPaso.getSelectedItem().toString() + " es de : 22000 ");
        }

        if (spinnerPaso.getSelectedItem().toString().equals("El Alquimista")) {
            textViewPaso.setText("El valor de " + spinnerPaso.getSelectedItem().toString() + " es de : 45000 ");
        }

        if (spinnerPaso.getSelectedItem().toString().equals("El Poder")) {
            textViewPaso.setText("El valor de " + spinnerPaso.getSelectedItem().toString() + " es de : 88000 ");
        }

        if (spinnerPaso.getSelectedItem().toString().equals("El Resplandor")) {
            textViewPaso.setText("El valor de " + spinnerPaso.getSelectedItem().toString() + " es de : 156000 ");
        }
    }
}