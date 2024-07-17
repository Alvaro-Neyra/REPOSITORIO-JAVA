import java.util.Scanner;

public class EjercicioComplementario {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanio;

        do {
            System.out.print("Ingresa el tamaño del arreglo: ");
            tamanio = sc.nextInt();
        } while (tamanio <= 0);

        int numero;
        System.out.print("Ingresa el número que deseas rellenar el arreglo: ");
        numero = sc.nextInt();

        int indiceInicial = 0;
        do {
            System.out.print("Ingresa el índice inicial: ");
            indiceInicial = sc.nextInt();
        } while (indiceInicial < 0 || indiceInicial >= tamanio);

        int indiceFinal = 0;
        do {
            System.out.print("Ingresa el índice final: ");
            indiceFinal = sc.nextInt();
        } while (indiceFinal < 0 || indiceFinal >= tamanio || indiceFinal < indiceInicial);

        int[] arregloGenerado = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            if (i >= indiceInicial && i <= indiceFinal) {
                arregloGenerado[i] = numero;
            } else {
                arregloGenerado[i] = 0;
            }
        }

        System.out.println("Arreglo generado: ");

        mostrarArreglo(arregloGenerado);
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("|" + arreglo[i] + "|");
        }
    }
}
