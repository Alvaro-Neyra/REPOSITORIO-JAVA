package DiaDeLaSemana;

import java.util.ArrayList;
import DiaDeLaSemana.enums.DiaDeSemana;

public class Application {
    public static void main(String[] args) {
        ArrayList<DiaDeSemana> dias = new ArrayList<DiaDeSemana>();
        for (int i = 0; i < 10; i++) {
            dias.add(DiaDeSemana.values()[numeroAleatorio(0, 6)]);
        }

        for (DiaDeSemana dia : dias) {
            imprimirDiaLaboral(dia);
        }
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void imprimirDiaLaboral(DiaDeSemana DIA) {
        if (DIA.esDiaLaboral()) {
            System.out.println(DIA + " es un día laboral");
        } else {
            System.out.println(DIA + " no es un día laboral");
        }
    }
}