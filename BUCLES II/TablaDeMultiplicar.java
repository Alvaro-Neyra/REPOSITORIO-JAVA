import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero = 0;
        System.out.print("Introduce un número entero positivo para mostrar la tabla de multiplicar: ");
        numero = sc.nextLong();
        while (numero != 0) {
            if (numero == 0) {
                break;
            } else {
                tablaMultiplicar(numero);
            }
            System.out.print("Introduce un número entero positivo para mostrar la tabla de multiplicar: ");
            numero = sc.nextLong();
        }
        
        sc.close();
    }

    public static void tablaMultiplicar(long numero) {
        for (int i = 0; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
