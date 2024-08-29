package Biblioteca.modelos;

import java.util.ArrayList;
import Biblioteca.modelos.Libro;
import Biblioteca.modelos.Persona;

public class Biblioteca {
    private ArrayList<Libro> catalogo = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getTitulo().equals(libro.getTitulo())) {
                System.out.println("El libro ya existe");
                return;
            }
        }

        catalogo.add(libro);
    }

    public void mostrarcatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo");
            return;
        }
        System.out.println("Catálogo de libros");
        for (Libro libro : catalogo) {
            libro.mostrarInformacion();
        }
    }

    public void eliminarLibro(String titulo) {
        boolean libroEncontrado = false;
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo)) {
                libroEncontrado = true;
                catalogo.remove(libro);
                System.out.println("Libro eliminado");
                break;
            }
        }

        if (!libroEncontrado) {
            System.out.println("Libro no encontrado");
        }
    }

    public void prestarLibro(Persona persona, String titulo) {
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo");
            return;
        }

        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getTitulo().equals(titulo)) {
                if (catalogo.get(i).prestado) {
                    System.out.println("El libro ya está prestado");
                    return;
                }

                catalogo.get(i).prestar();
                persona.getLibrosPrestados().add(catalogo.get(i));
                System.out.println("Libro prestado");
                return;
            }
        }
    }

    public void devolverLibro(Persona persona, String titulo) {
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo");
            return;
        }

        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getTitulo().equals(titulo)) {
                if (!catalogo.get(i).prestado) {
                    System.out.println("El libro no está prestado");
                    return;
                }

                catalogo.get(i).devolver();
                persona.getLibrosPrestados().remove(catalogo.get(i));
                System.out.println("Libro prestado");
                return;
            }
        }
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }
}
