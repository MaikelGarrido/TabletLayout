package com.example.tablelayout;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String color;
    private String comida;

    public Persona(String nombre, String apellido, int edad, String color, String comida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.color = color;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public String getComida() {
        return comida;
    }

    public static List<Persona> personaList() {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        listaPersonas.add(new Persona("Diego", "Gutiérrez", 30, "Azul", "Cazuela"));
        listaPersonas.add(new Persona("Camila", "Hernández", 25, "Rojo", "Curanto"));
        listaPersonas.add(new Persona("Tomás", "Martínez", 35, "Verde", "Empanadas"));
        listaPersonas.add(new Persona("Isabella", "Rodríguez", 40, "Amarillo", "Pastel de choclo"));
        listaPersonas.add(new Persona("Santiago", "García", 20, "Morado", "Asado"));
        listaPersonas.add(new Persona("Valentina", "López", 28, "Naranja", "Sopaipillas"));
        listaPersonas.add(new Persona("Matías", "Sánchez", 33, "Rosa", "Pebre"));
        listaPersonas.add(new Persona("Javiera", "Pérez", 45, "Negro", "Porotos granados"));
        listaPersonas.add(new Persona("Lucas", "Flores", 22, "Blanco", "Humitas"));
        listaPersonas.add(new Persona("Antonia", "Muñoz", 37, "Gris", "Chapalele"));
        return listaPersonas;
    }
}