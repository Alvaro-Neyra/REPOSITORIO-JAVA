import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> clientes = leerDatos();
        Integer turnoMaximo = clientes.size();
        Integer turnoGanador = realizarSorteo(turnoMaximo);
        String ganador = mostrarGanador(turnoGanador, clientes);
        System.out.println(mostrarResultados(clientes, turnoGanador, ganador));
    }

    public static List<String> leerDatos() {
        List<String> clientes = new ArrayList<String>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Ingrese el nombre del cliente o salir para terminar: ");
                String cliente = sc.nextLine();
                if (cliente.equals("salir")) {
                    break;
                }
                clientes.add(cliente);
            }
            return clientes;
        } catch (Exception e) {
            throw new RuntimeException("Error al leer los datos");
        }
    }

    public static Integer realizarSorteo(Integer turnoMaximo) {
        return (int) ((Math.random() * turnoMaximo) + 1);
    }

    public static String mostrarGanador(Integer turnoGanador, List<String> clientes) {
        return clientes.get(turnoGanador - 1);
    }

    public static String mostrarResultados(List<String> clientes, Integer numeroSorteado, String ganador) {
        return """
                Resultados:
                El número sorteado es: %d
                El ganador es: %s
                Los participantes son: %s
                """.formatted(numeroSorteado, ganador, clientes);
    }

    public static int pedirNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Error, no has introducido un número entero.");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Error, no has introducido un número entero.");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }
}