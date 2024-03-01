package com.example.tablelayout;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String color;
    private String comida;
    private String hobby;
    private String ciudad;
    private String profesion;

    public Persona(String nombre, String apellido, int edad, String color, String comida, String hobby, String ciudad, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.color = color;
        this.comida = comida;
        this.hobby = hobby;
        this.ciudad = ciudad;
        this.profesion = profesion;
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

    public String getHobby() {
        return hobby;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public static List<Persona> personaList() {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Juan", "Pérez", 30, "Azul", "Empanadas", "Fútbol", "Santiago", "Ingeniero"));
        listaPersonas.add(new Persona("María", "Gómez", 25, "Rojo", "Asado", "Pintura", "Valparaíso", "Arquitecta"));
        listaPersonas.add(new Persona("Carlos", "López", 40, "Verde", "Cazuela", "Lectura", "Concepción", "Profesor"));
        listaPersonas.add(new Persona("Ana", "Martínez", 35, "Negro", "Pastel de choclo", "Música", "Viña del Mar", "Abogada"));
        listaPersonas.add(new Persona("Pedro", "Rodríguez", 28, "Blanco", "Charquicán", "Cine", "Antofagasta", "Contador"));
        listaPersonas.add(new Persona("Laura", "Hernández", 22, "Morado", "Sopaipillas", "Viajar", "La Serena", "Diseñadora"));
        listaPersonas.add(new Persona("Jorge", "García", 45, "Naranjo", "Chorrillana", "Deportes", "Rancagua", "Médico"));
        listaPersonas.add(new Persona("Luis", "Torres", 32, "Celeste", "Pastel de jaiba", "Ajedrez", "Temuco", "Ingeniero civil"));
        listaPersonas.add(new Persona("Carmen", "Sánchez", 27, "Amarillo", "Curanto", "Jardinería", "Puerto Montt", "Profesora"));
        listaPersonas.add(new Persona("Diego", "Martín", 38, "Marrón", "Empanadas de pino", "Gastronomía", "Iquique", "Chef"));
        listaPersonas.add(new Persona("Paula", "Ruiz", 29, "Gris", "Lomo a lo pobre", "Bailar", "Copiapó", "Psicóloga"));
        listaPersonas.add(new Persona("Mario", "Gutiérrez", 33, "Turquesa", "Paila marina", "Escritura", "Arica", "Periodista"));
        listaPersonas.add(new Persona("Sofía", "Díaz", 26, "Violeta", "Ceviche", "Pintura", "Coquimbo", "Artista plástica"));
        listaPersonas.add(new Persona("Gonzalo", "Romero", 31, "Rojo oscuro", "Chupe de camarones", "Ajedrez", "Calama", "Ingeniero eléctrico"));
        listaPersonas.add(new Persona("Valentina", "Jiménez", 24, "Verde oscuro", "Pastel de choclo", "Cocinar", "Puerto Varas", "Nutricionista"));
        listaPersonas.add(new Persona("Hernán", "López", 36, "Gris claro", "Asado", "Viajar", "Chillán", "Empresario"));
        listaPersonas.add(new Persona("Carolina", "Suárez", 28, "Naranja", "Cazuela", "Deportes", "Quillota", "Administrativa"));
        listaPersonas.add(new Persona("Andrés", "Martínez", 30, "Azul marino", "Sushi", "Música", "Osorno", "Ingeniero en sistemas"));
        listaPersonas.add(new Persona("Camila", "García", 33, "Negro", "Pizza", "Cine", "Punta Arenas", "Docente"));
        listaPersonas.add(new Persona("Pablo", "Fernández", 29, "Blanco", "Milanesa", "Lectura", "Valdivia", "Escritor"));
        return listaPersonas;
    }
}