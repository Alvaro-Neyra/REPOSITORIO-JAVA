import java.util.InputMismatchException;
import java.util.Scanner;

class Auto {
    private String marca;
    private String modelo;
    private int anio;

    // Constructores
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {}

    public void imprimirDatos() {
        if (marca != null || modelo != null || anio != 0) {
            if (marca != null) {
                System.out.println("Marca: " + marca);
            }
            if (modelo != null) {
                System.out.println("Modelo: " + modelo);
            }
            if (anio != 0) {
                System.out.println("Año: " + anio);
            }
        } else {
                System.out.println("No se ha inicializado ningún dato del auto.");
        }
    }

    // getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnio() {
        return anio;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}

public class EjercicioComplementario {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        Auto auto = new Auto();
        int opcion = 0;
        do {
            menu1();
            opcion = pedirOpcion();
            ejecutarOpcion(opcion, auto);
        } while (opcion != 6);
    }

    public static void menu1() {
        System.out.println("1. Especificar marca");
        System.out.println("2. Especificar modelo");
        System.out.println("3. Especificar año");
        System.out.println("4. Imprimir datos");
        System.out.println("5. Borrar datos");
        System.out.println("6. Salir");
    }

    public static int pedirOpcion() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.print("Ingrese una opcion: ");
                numero = sc.nextInt();
                sc.nextLine(); // Limpiar el scanner
            } catch (InputMismatchException e){
                System.out.print("Error: Debe ingresar un número entero.");
                sc.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.print("Error: " + e.getMessage());
                sc.nextLine(); // Limpiar el scanner
                error = true;
            }
        } while (error);

        return numero;
    }

    public static void ejecutarOpcion(int opcion, Auto auto) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la marca del auto: ");
                String marcaActual = sc.nextLine();
                auto.setMarca(marcaActual);
                break;
            case 2:
                System.out.println("Ingrese el modelo del auto: ");
                String modelo = sc.nextLine();
                auto.setModelo(modelo);
                break;
            case 3:
                System.out.println("Ingrese el año del auto: ");
                int anio = sc.nextInt();
                auto.setAnio(anio);
                break;
            case 4:
                auto.imprimirDatos();
                break;
            case 5:
                auto.setAnio(0);
                auto.setMarca(null);
                auto.setModelo(null);
                System.out.println("Datos borrados.");
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
