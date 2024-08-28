package GestionBiblioteca.modelos;

public interface Catalogable {
    public int nroEdicion = 0;
    public int cantidadEjemplares = 0;
    public String nombreRevista = "";
    
    public void prestar();
    public void devolver();
    public void obtenerInformacion();
}
