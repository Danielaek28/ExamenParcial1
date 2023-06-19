package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.titulo2);
        String[] nombre={"TIERRA","MARTE","JUPITER","VENUS","MERCURIO","SATURNO","URANO","NEPTUNO"};
        Integer[] idimagen={R.drawable.tierra,R.drawable.marte,R.drawable.jupiter,R.drawable.venus,R.drawable.mercurio,R.drawable.saturno,R.drawable.neptuno,R.drawable.urano};
        adapterList adapter = new adapterList(this, nombre, idimagen);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent,View view, int position, long id){
                Toast.makeText(getApplicationContext(), "Seleccionaste el planeta:"+nombre, Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),descripcion.class);
                startActivity(i);
            }
        });
    }
}