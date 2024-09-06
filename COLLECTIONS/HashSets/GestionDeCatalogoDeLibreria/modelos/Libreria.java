package GestionDeCatalogoDeLibreria.modelos;
import java.util.HashSet;

public class Libreria {
    private HashSet<Libro> libros;

    public Libreria() {
        this.libros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro); // Se verifica que no se duplicados en el hashSet por medio del metodo equals y que verifica que el atributo ISBN sea igual
    }

    public void eliminarLibro(int ISBN) {
        Libro libro = new Libro("", "", ISBN);
        libros.remove(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getISBN());
        }
    }
}
