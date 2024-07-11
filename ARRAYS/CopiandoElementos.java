import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int[] copiaNumeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println("Elementos del arreglo   original");
        System.out.print("|");
        System.out.print(numeros[0] + "|" + " |");
        System.out.print(numeros[1] + "|" + " |");
        System.out.println(numeros[2] + "|");

        copiaNumeros[0] = numeros[0];
        copiaNumeros[1] = numeros[1];
        copiaNumeros[2] = numeros[2];

        System.out.println("Ingresa dos numeros para copiar al nuevo arreglo");
        System.out.print("Ingresa el primer nuevo numero: ");
        copiaNumeros[3] = sc.nextInt();
        System.out.print("Ingresa el segundo nuevo numero: ");
        copiaNumeros[4] = sc.nextInt();

        System.out.println("Elementos del arreglo copia");
        System.out.print("|");
        System.out.print(copiaNumeros[0] + "|" + " |");
        System.out.print(copiaNumeros[1] + "|" + " |");
        System.out.print(copiaNumeros[2] + "|" + " |");
        System.out.print(copiaNumeros[3] + "|" + " |");
        System.out.print(copiaNumeros[4] + "|");

        sc.close();
    }
}
