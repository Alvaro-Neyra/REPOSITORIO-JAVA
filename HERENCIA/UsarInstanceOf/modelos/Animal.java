package UsarInstanceOf.modelos;

public class Animal {
    protected String nombre;
    protected int edad;

    protected Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(this.nombre + " está comiendo");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo");
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public int getEdad() {
        return this.edad;
    }
}
