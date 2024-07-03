import java.util.Scanner;

public class DiasHabiles {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String diaSemana = "";

        System.out.println("Ingresa el numero de dia de la semana: ");

        int dia = miScanner.nextInt();

        boolean diaHabil = false;

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Opción no válida");
                System.exit(0);
        }
        
        if (dia >= 1 && dia <= 5) {
            diaHabil = true;
        } else {
            diaHabil = false;
        }

        if (diaHabil) {
            System.out.println("El dia " + diaSemana + " es un dia habil");
        } else {
            System.out.println("El dia " + diaSemana + " no es un dia habil");
        }
    }
}
