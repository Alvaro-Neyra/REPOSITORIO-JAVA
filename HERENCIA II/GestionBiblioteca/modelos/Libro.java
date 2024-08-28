package GestionBiblioteca.modelos;
import GestionBiblioteca.modelos.ItemBiblioteca;

public class Libro extends GestionBiblioteca.modelos.ItemBiblioteca {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public void calcularMultas() {
        System.out.println("Calculando multas para el libro " + this.titulo);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public boolean getPrestado() {
        return this.prestado;
    }
}
