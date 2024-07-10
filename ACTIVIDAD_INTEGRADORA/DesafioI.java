import java.util.Scanner;
import java.util.InputMismatchException;

public class DesafioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double temperatura;
            try {
                System.out.print("Ingrese una temperatura: ");
                temperatura = sc.nextDouble();
                
                char unidadDeMedida;

                System.out.print("Ingrese la unidad de medida Celcius(C) o Fahrenheit(F): ");
                do {
                    String input = sc.nextLine();

                    if (input.length() > 0) {
                        unidadDeMedida = input.charAt(0);
                    } else {
                        unidadDeMedida = ' ';
                    }

                    if (unidadDeMedida != 'C' && unidadDeMedida != 'F' && unidadDeMedida != ' ') {
                        System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                        System.out.print("Ingrese la unidad de medida Celcius(C) o Fahrenheit(F): ");
                    }
                } while (unidadDeMedida != 'C' && unidadDeMedida != 'F');

                sc.close();
                
                if (unidadDeMedida == 'F') {
                    // Convertir la temperatura de Fahrenheit a Celcius
                    double celcius = (temperatura - 32) * 5 / 9;
                    System.out.println(temperatura + " grados Fahrenheit equivale a " + celcius + " grados Celcius.");
                } else {
                    double fahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.println(temperatura + " grados Celcius equivale a " + fahrenheit + " grados Fahrenheit.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico.");
                main(args);
            }
    }
}