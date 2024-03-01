package com.example.tablelayout;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> personaList = Persona.personaList();
    private TableLayout tableLayout;
    private ScrollView scrollView;
    private HorizontalScrollView horizontalScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // Iniciando TableLayout
        initTabletLayout();

        // Iniciando cabeceras
        initHeaderTableRow();

        // Insertando datos en la tabla
        initPersonaList();
    }

    void initTabletLayout() {
        // Inicialización de variables de componentes
        tableLayout = new TableLayout(this);
        scrollView = new ScrollView(this);
        horizontalScrollView = new HorizontalScrollView(this);

        scrollView.addView(tableLayout);
        horizontalScrollView.addView(scrollView);

        // Visualización de los componentes
        setContentView(horizontalScrollView);

        // Deshabilitar visualización de scroll
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setVerticalScrollBarEnabled(false);
    }

    void initHeaderTableRow() {
        TableRow headerRow = new TableRow(this);

        // Fondo para cabecera
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.LTGRAY);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);

        // Nombre
        TextView headerNombre = new TextView(this);
        headerNombre.setText("Nombre");
        headerNombre.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerNombre.setBackground(shapeDrawable);
        headerRow.addView(headerNombre);


        // Apellido
        TextView headerApellido = new TextView(this);
        headerApellido.setText("Apellido");
        headerApellido.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerApellido.setBackground(shapeDrawable);
        headerRow.addView(headerApellido);

        // Edad
        TextView headerEdad = new TextView(this);
        headerEdad.setText("Edad");
        headerEdad.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerEdad.setBackground(shapeDrawable);
        headerRow.addView(headerEdad);

        // Color
        TextView headerColor = new TextView(this);
        headerColor.setText("Color");
        headerColor.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerColor.setBackground(shapeDrawable);
        headerRow.addView(headerColor);

        // Comida
        TextView headerComida = new TextView(this);
        headerComida.setText("Comida");
        headerComida.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerComida.setBackground(shapeDrawable);
        headerRow.addView(headerComida);

        // Agregando configuración
        headerNombre.setLayoutParams(configTableRow());
        headerApellido.setLayoutParams(configTableRow());
        headerEdad.setLayoutParams(configTableRow());
        headerColor.setLayoutParams(configTableRow());
        headerComida.setLayoutParams(configTableRow());

        // Visualización de cabeceras
        tableLayout.addView(headerRow);
    }

    // Recorriendo lista de personas
    void initPersonaList() {
        for (Persona persona : personaList) {
            TableRow tableRow = new TableRow(this);

            // TextView nombre e insersión de nombre
            TextView nombreView = new TextView(this);
            nombreView.setText(persona.getNombre());
            nombreView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(nombreView);

            // TextView apellido e insersión de apellido
            TextView apellidoView = new TextView(this);
            apellidoView.setText(persona.getApellido());
            apellidoView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(apellidoView);

            // TextView edad e insersión de edad
            TextView edadView = new TextView(this);
            edadView.setText(String.valueOf(persona.getEdad()));
            edadView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(edadView);

            // TextView color e insersión de color
            TextView colorView = new TextView(this);
            colorView.setText(persona.getColor());
            colorView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(colorView);

            // TextView comida e insersión de comida
            TextView comidaView = new TextView(this);
            comidaView.setText(persona.getComida());
            comidaView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(comidaView);

            // Agregando configuración a cada TextView
            nombreView.setLayoutParams(configTableRow());
            apellidoView.setLayoutParams(configTableRow());
            edadView.setLayoutParams(configTableRow());
            colorView.setLayoutParams(configTableRow());
            comidaView.setLayoutParams(configTableRow());

            tableLayout.addView(tableRow);
        }
    }

    // Configuración de margenes y demás
    TableRow.LayoutParams configTableRow() {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(10, 10, 10, 10);
        layoutParams.weight = 1;
        return layoutParams;
    }
}