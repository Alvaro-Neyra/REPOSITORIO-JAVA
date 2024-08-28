package GestionBiblioteca.modelos;

public abstract class ItemBiblioteca {
    abstract void prestar();
    abstract void devolver();
    abstract void calcularMultas();
}