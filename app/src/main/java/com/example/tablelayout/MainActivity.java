package com.example.tablelayout;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    private TableRow tableRow;
    private ScrollView scrollView;
    private HorizontalScrollView horizontalScrollView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciando botón
        initButton();


    }

    void initButton() {
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            // Iniciando TableLayout
            initTabletLayout();

            // Iniciando cabeceras
            //initHeaderTableRow();

            // Insertando datos en la tabla
            initPersonaList();
        });
    }

    void initTabletLayout() {
        // Inicialización de variables de componentes
        tableLayout = findViewById(R.id.tableLayout);
        scrollView = findViewById(R.id.scrollView);
        horizontalScrollView = findViewById(R.id.horizontalScrollView);

        //scrollView.addView(tableLayout);
        //horizontalScrollView.addView(scrollView);

        // Visualización de los componentes
        //setContentView(horizontalScrollView);

        // Deshabilitar visualización de scroll
        //horizontalScrollView.setHorizontalScrollBarEnabled(false);
        //scrollView.setVerticalScrollBarEnabled(false);
    }

    void initHeaderTableRow() {
        tableRow = findViewById(R.id.tableRow);
        //TableRow headerRow = new TableRow(this);

        // Fondo para cabecera
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.LTGRAY);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);

        // Nombre
        TextView headerNombre = new TextView(this);
        headerNombre.setText("Nombre");
        headerNombre.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerNombre.setBackground(shapeDrawable);
        tableRow.addView(headerNombre);


        // Apellido
        TextView headerApellido = new TextView(this);
        headerApellido.setText("Apellido");
        headerApellido.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerApellido.setBackground(shapeDrawable);
        tableRow.addView(headerApellido);

        // Edad
        TextView headerEdad = new TextView(this);
        headerEdad.setText("Edad");
        headerEdad.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerEdad.setBackground(shapeDrawable);
        tableRow.addView(headerEdad);

        // Color
        TextView headerColor = new TextView(this);
        headerColor.setText("Color");
        headerColor.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerColor.setBackground(shapeDrawable);
        tableRow.addView(headerColor);

        // Comida
        TextView headerComida = new TextView(this);
        headerComida.setText("Comida");
        headerComida.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        headerComida.setBackground(shapeDrawable);
        tableRow.addView(headerComida);

        // Agregando configuración
        headerNombre.setLayoutParams(configTableRow());
        headerApellido.setLayoutParams(configTableRow());
        headerEdad.setLayoutParams(configTableRow());
        headerColor.setLayoutParams(configTableRow());
        headerComida.setLayoutParams(configTableRow());

        // Visualización de cabeceras
        tableLayout.addView(tableRow);
    }

    // Recorriendo lista de personas
    void initPersonaList() {
        for (Persona persona : personaList) {
            TableRow tableRow = new TableRow(this);

            TextView registro1 = new TextView(this);
            registro1.setBackground(getDrawable(R.drawable.bordes_grilla));

            TextView registro2 = new TextView(this);
            registro2.setBackground(getDrawable(R.drawable.bordes_grilla));

            TextView registro3 = new TextView(this);
            registro3.setBackground(getDrawable(R.drawable.bordes_grilla));;

            TextView registro4 = new TextView(this);
            registro4.setBackground(getDrawable(R.drawable.bordes_grilla));

            TextView registro5 = new TextView(this);
            registro5.setBackground(getDrawable(R.drawable.bordes_grilla));

            TextView registro6 = new TextView(this);
            //registro6.setBackground(getDrawable(R.drawable.bordes_grilla));
            registro6.setVisibility(View.GONE);

            TextView registro7 = new TextView(this);
            //registro7.setBackground(getDrawable(R.drawable.bordes_grilla));
            registro7.setVisibility(View.GONE);

            registro1.setText(persona.getNombre());
            registro1.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro1);

            registro2.setText(persona.getApellido());
            registro2.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro2);

            registro3.setText(String.valueOf(persona.getEdad()));
            registro3.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro3);

            // TextView color e insersión de color
            //TextView colorView = new TextView(this);
            registro4.setText(String.valueOf(persona.getColor()));
            registro4.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro4);

            // TextView comida e insersión de comida
            //TextView comidaView = new TextView(this);
            registro5.setText(String.valueOf(persona.getComida()));
            registro5.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro5);

            // TextView comida e insersión de hobby
            registro6.setText(String.valueOf(persona.getHobby()));
            registro6.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro6);

            // TextView comida e insersión de ciudad
            registro7.setText(String.valueOf(persona.getCiudad()));
            registro7.setTextAlignment(TEXT_ALIGNMENT_CENTER);
            tableRow.addView(registro7);

            // Agregando configuración a cada TextView
            //registro1.setLayoutParams(configTableRow());
            //registro2.setLayoutParams(configTableRow());
            //registro3.setLayoutParams(configTableRow());
            //registro4.setLayoutParams(configTableRow());
            //registro5.setLayoutParams(configTableRow());
            //registro6.setLayoutParams(configTableRow());
            //registro7.setLayoutParams(configTableRow());

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