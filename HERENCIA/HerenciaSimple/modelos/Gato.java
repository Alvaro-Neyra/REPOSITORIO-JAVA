package HerenciaSimple.modelos;
import HerenciaSimple.modelos.Animal;

public class Gato extends Animal{
    private String raza;
    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public void maullar() {
        System.out.println(this.nombre + " está maullando");
    }
    public void setRaza(String nuevaRaza) {
        this.raza = nuevaRaza;
    }
    public String getRaza() {
        return this.raza;
    }
}
