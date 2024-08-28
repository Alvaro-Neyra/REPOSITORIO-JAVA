package modelos;
import modelos.Equipo;

public class Persona {
    protected String nombre;
    protected int edad;
    protected Equipo equipo;

    public Persona(String nombre, int edad, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public void gritarGol() {
        System.out.println("¡Gol!");
    }

    public void gritarGol(String nombreJugador) {
        System.out.println("¡Gol de " + nombreJugador + "!");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
