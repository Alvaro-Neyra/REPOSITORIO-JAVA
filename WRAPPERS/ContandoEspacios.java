import java.util.Scanner;

public class ContandoEspacios {
    public static void main(String[] args) {
        espacioEnBlanco();    
    }

    public static void espacioEnBlanco() {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String str = s.nextLine();

        int cont = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                cont++;
            }
        }

        System.out.println("La cantidad de espacios en blanco es: " + cont);

        s.close();
    }
}