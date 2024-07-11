import java.util.Scanner;

public class SumandoElementosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 numeros");
        System.out.println("Solo se sumaran los numeros con los indices pares del arreglo.");
        System.out.print("Ingresa el primer numero: ");
        numeros[0] = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numeros[1] = sc.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        numeros[2] = sc.nextInt();
        System.out.print("Ingresa el cuarto numero: ");
        numeros[3] = sc.nextInt();
        System.out.print("Ingresa el quinto numero: ");
        numeros[4] = sc.nextInt();

        int suma = numeros[0] + numeros[2] + numeros[4];

        System.out.println("La suma de los numeros con indices pares es: " + suma);

        sc.close();
    }
}
