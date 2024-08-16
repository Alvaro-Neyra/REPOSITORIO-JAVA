class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo imprimirDatos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}


public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        persona1.imprimirDatos();
        Persona persona2 = new Persona("Maria", 30);
        persona2.imprimirDatos();
    }
}