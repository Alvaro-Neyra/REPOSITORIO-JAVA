import java.util.Scanner;

public class VerificarCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        boolean todosLetras = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                todosLetras = false;
                break;
            }
        }

        if (todosLetras) {
            System.out.println("La cadena ingresada es: " + cadena + " y todos sus caracteres son letras");
        } else {
            System.out.println("La cadena ingresada no contiene solo letras");
        }
    }
}
