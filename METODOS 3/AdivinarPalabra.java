import java.util.Scanner;

public class AdivinarPalabra {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] palabras = {"sol", "luna", "estrella", "nube", "lluvia", "viento", "mar", "rio", "bosque", "montana"};

        int intento = 0;
        String palabra = elegirPalabra(palabras);
        Character[] palabraAAdivinar = null;
        palabraAAdivinar = generarPalabra(palabra);
        System.out.println("La palabra a adivinar tiene " + palabra.length() + " letras.");
        pistaDePalabra(palabraAAdivinar, palabra.length());
        while (intento < 6) {
            char letra = pedirLetra();
            if (verificarLetra(palabra, letra)) {
                palabraAAdivinar = actualizarPalabra(palabraAAdivinar, palabra, letra);
                pistaDePalabra(palabraAAdivinar, palabra.length());
                if (verificarPalabraCompleta(palabraAAdivinar)) {
                    System.out.println("¡Felicidades! Has adivinado la palabra.");
                    break;
                }
            } else {
                intento++;
                System.out.println("Letra incorrecta. Te quedan " + (6 - intento) + " intentos.");
            }
        }
        sc.close();
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String elegirPalabra(String[] palabras) {
        int indice = numeroAleatorio(0, palabras.length - 1);
        String palabra = palabras[indice];
        return palabra;
    }

    public static Character[] generarPalabra(String palabra) {
        Character[] palabraAAdivinar = new Character[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraAAdivinar[i] = '_';
        }
        return palabraAAdivinar;
    }

    public static void pistaDePalabra(Character[] palabraAAdivinar, int longitud) {
        for (int i = 0; i < palabraAAdivinar.length; i++) {
            System.out.print(palabraAAdivinar[i] + " ");
        }
        System.out.println();
    }

    public static boolean verificarLetra(String palabra, char letra) {
        boolean encontrado = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static Character[] actualizarPalabra(Character[] palabraAAdivinar, String palabra, char letra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                palabraAAdivinar[i] = letra;
            }
        }
        return palabraAAdivinar;
    }

    public static boolean verificarPalabraCompleta(Character[] palabraAAdivinar) {
        boolean completa = true;
        for (int i = 0; i < palabraAAdivinar.length; i++) {
            if (palabraAAdivinar[i] == '_') {
                completa = false;
                break;
            }
        }
        return completa;
    }

    public static char pedirLetra() {
        char letra = ' ';
        boolean error = false;

        do {
            error = false;
            try {
                do {
                    System.out.print("Introduce una letra: ");
                    letra = sc.next().charAt(0);

                    if (!Character.isLetter(letra)) {
                        System.out.println("Debes introducir una letra");
                    }
                } while (!Character.isLetter(letra));
            } catch (Exception e) {
                System.out.println("Error inesperado");
                sc.nextLine();
                error = true;
            }
        } while (error);

        return letra;
    }
}
