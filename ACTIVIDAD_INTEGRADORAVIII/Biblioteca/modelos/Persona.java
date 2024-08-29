package Biblioteca.modelos;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}
