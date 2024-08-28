package HerenciaSimple.modelos;
import HerenciaSimple.modelos.Animal;

public class Perro extends Animal{
    private String raza;
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println(this.nombre + " está ladrando");
    }
    public void setRaza(String nuevaRaza) {
        this.raza = nuevaRaza;
    }
    public String getRaza() {
        return this.raza;
    }
}
