package GestionDeCatalogoDeLibreria.modelos;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Comparando direccion de memoria
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // Compara si el objeto es nulo o si el objeto es de una clase diferente
            return false;
        }
        Libro libro = (Libro) obj; // Si el objeto es de la misma clase, se castea (cambiar de tipo o clase) a Libro
        return ISBN == libro.ISBN; // Se compara si los valores del atributo ISBN son iguales
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
