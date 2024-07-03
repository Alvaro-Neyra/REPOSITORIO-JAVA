import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        int dia = miScanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }
        miScanner.close();
    }
}