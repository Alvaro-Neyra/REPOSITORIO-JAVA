import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresar la calificacion del (1 al 5): ");
        int calificacion = miScanner.nextInt();

        switch (calificacion) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
        }
        miScanner.close();        
    }
}
