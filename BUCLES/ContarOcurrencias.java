package BUCLES;
import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        // Generando un arreglo de caracteres que forman una frase
        char[] letras = new char[]{'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', ' ', 'j', 'a', 'v', 'a'};

        Scanner sc = new Scanner(System.in);

        char letraABuscar;
        
        System.out.print("Introduce la letra que deseas buscar en la frase: ");
        letraABuscar = sc.next().charAt(0);
        letraABuscar = Character.toLowerCase(letraABuscar);

        int contadorDeOcurrencias = 0;

        for (char letra: letras) {
            if (letra == letraABuscar) {
                contadorDeOcurrencias++;
            }
        }

        if (contadorDeOcurrencias == 0) {
            System.out.println("La letra " + letraABuscar + " no se encuentra en la frase.");
        } else {
            System.out.println("La letra " + letraABuscar + " se repite " + contadorDeOcurrencias + " veces en la frase.");
        }

        sc.close();
    }
}
