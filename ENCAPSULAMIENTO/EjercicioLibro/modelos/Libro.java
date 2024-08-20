package EjercicioLibro.modelos;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor
    public Libro() {
        titulo = "Sin título";
        autor = "Sin autor";
        paginas = 0;
    }
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Getters y Setters
    // Getters: Métodos que devuelven el valor de un atributo
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    // Setters: Métodos que establecen el valor de un atributo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0) {
            this.paginas = paginas * 7;
        }
    }

    public void imprimirDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }
}
