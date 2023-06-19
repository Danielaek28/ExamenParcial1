package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        Spinner spinner = (Spinner) findViewById(R.id.descripcion);

        final String[] descripcion = {"HISTORIA", "diametro", "Composición de la atmósfera"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, descripcion);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long i) {
                Toast.makeText(getApplicationContext(), "El elemento seleccionado es:" + adapterView.getItemAtPosition(position), Toast.LENGTH_LONG).show();
            }


            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }

}