package com.example.planetas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

public class adapterList extends ArrayAdapter<String> {
    private final MainActivity context;
    private final String [] nombres;

    private final Integer[] idimagen;

    public adapterList(MainActivity context, String[] nombres, Integer[] idimagen) {
        super(context,R.layout.itemm,nombres);
        this.context=context;
        this.nombres=nombres;
        this.idimagen=idimagen;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemm, null);
        TextView _nombre = (TextView) rowView.findViewById(R.id.nombre);
        ImageView _imagen = (ImageView) rowView.findViewById(R.id.pl1);
        _nombre.setText(nombres[position]);
        _imagen.setImageResource(idimagen[position]);
    return rowView;
    }


}
