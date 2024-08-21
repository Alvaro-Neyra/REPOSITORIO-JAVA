package sistemaDeGestion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import sistemaDeGestion.modelos.Empleado;

public class Application {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int opcion = 0;
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Empleado> empleadosFiltrados = new ArrayList<Empleado>();
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    Empleado.mostrarEmpleados(empleados);
                    break;
                case 2:
                    Empleado empleadoNuevo = crearEmpleado();
                    empleados.add(empleadoNuevo);
                    empleadosFiltrados.add(empleadoNuevo);
                    System.out.println("Empleado creado con éxito.");
                    break;
                case 3:
                    int opcionAtributo = 0;
                    String atributo = pedirAtributo();
                    if (atributo.equals("string")) {
                        System.out.print("Ingrese el valor del atributo: ");
                        String valor = scanner.nextLine();
                        boolean filtrado = Empleado.filtrarEmpleados(empleadosFiltrados, valor);
                        if (filtrado == false) {
                            System.out.println("No se encontraron empleados con el valor ingresado.");
                        }
                    } else if (atributo.equals("edad")) {
                        // Se pide por valor o por minimo y maximo
                        do {
                            System.out.println("Desea filtrar por:");
                            System.out.println("1. Valor exacto");
                            System.out.println("2. Rango de edades");
                            opcionAtributo = pedirOpcion();
                    
                            if (opcionAtributo != 1 && opcionAtributo != 2) {
                                System.out.println("Opción inválida. Intente de nuevo.");
                            }
                        } while (opcionAtributo != 1 && opcionAtributo != 2);
                    
                        if (opcionAtributo == 1) {
                            int valor = pedirNumero("Ingrese el valor del atributo:");
                            Empleado.filtrarEmpleados(empleadosFiltrados, valor);
                        } else {
                            int minimo = pedirNumero("Ingrese el valor mínimo del rango:");
                            int maximo = pedirNumero("Ingrese el valor máximo del rango:");
                            Empleado.filtrarEmpleados(empleadosFiltrados, minimo, maximo);
                        }
                    } else if (atributo.equals("salario")) {
                        do {
                            System.out.println("Desea filtrar por:");
                            System.out.println("1. Valor exacto");
                            System.out.println("2. Rango de salarios");
                            opcionAtributo = pedirOpcion();
                    
                            if (opcionAtributo != 1 && opcionAtributo != 2) {
                                System.out.println("Opción inválida. Intente de nuevo.");
                            }
                        } while (opcionAtributo != 1 && opcionAtributo != 2);
                    
                        if (opcionAtributo == 1) {
                            double valor = pedirNumeroDecimal("Ingrese el valor del atributo:");
                            Empleado.filtrarEmpleados(empleadosFiltrados, valor);
                        } else {
                            double minimo = pedirNumeroDecimal("Ingrese el valor mínimo del rango:");
                            double maximo = pedirNumeroDecimal("Ingrese el valor máximo del rango:");
                            Empleado.filtrarEmpleados(empleadosFiltrados, minimo, maximo);
                        }
                    } else {
                        System.out.println("No se puede filtrar por el atributo seleccionado.");
                    }
                    break;
                case 4:
                    String atributoOrdenar = pedirAtributo();
                    empleadosFiltrados = Empleado.ordenarPorAtributo(empleadosFiltrados, atributoOrdenar);
                    System.out.println("Empleados ordenados por " + atributoOrdenar);
                    Empleado.mostrarEmpleados(empleadosFiltrados);
                    break;
                case 5:
                    double incremento = pedirNumeroDecimal("Ingrese el incremento de salario: ");
                    int indice = pedirIndiceEmpleado(empleadosFiltrados);
                    Empleado empleadoActual = empleadosFiltrados.get(indice);
                    Empleado empleado2 = Empleado.incrementarSalario(empleadoActual, incremento);
                    empleadosFiltrados.set(indice, empleado2);
                    System.out.println("Salario incrementado a " + empleado2.getSalario());
                    break;
                case 6:
                    empleadosFiltrados = new ArrayList<Empleado>(empleados);
                    System.out.println("Filtros limpiados.");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 7);
    }

    public static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Mostrar todos los empleados");
        System.out.println("2. Crear empleado");
        System.out.println("3. Filtrar empleados");
        System.out.println("4. Ordenar empleados");
        System.out.println("5. Incrementar salario");
        System.out.println("6. Limpiar filtros");
        System.out.println("7. Salir");
    }

    public static int pedirOpcion() {
        boolean error = false;
        int opcion = 0;
        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese una opción: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion < 1 || opcion > 7) {
                        System.out.println("Opción inválida. Intente de nuevo.");
                    }
                } while (opcion < 1 || opcion > 7);
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Ocurrió un error. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            }
        } while (error);
        return opcion;
    }
    

    public static Empleado crearEmpleado() {
        Empleado empleado = new Empleado();
        System.out.println("Ingrese el nombre del empleado:");
        empleado.setNombre(scanner.nextLine());
        empleado.setEdad(pedirNumero("Ingrese la edad del empleado:"));
        empleado.setSalario(pedirNumeroDecimal("Ingrese el salario del empleado:"));
        System.out.println("Ingrese el departamento del empleado:");
        empleado.setDepartamento(scanner.nextLine());
        return empleado;
    }

    public static int pedirNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                do {
                    System.out.println(mensaje);
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    if (numero < 0) {
                        System.out.println("Número inválido. Intente de nuevo.");
                    }
                } while (numero < 0);
            } catch (InputMismatchException e) {
                System.out.println("Número inválido. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Ocurrió un error. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static double pedirNumeroDecimal(String mensaje) {
        boolean error = false;
        double numero = 0;
        do {
            error = false;
            try {
                do {
                    System.out.println(mensaje);
                    numero = scanner.nextDouble();
                    scanner.nextLine();
                    if (numero < 0) {
                        System.out.println("Número inválido. Intente de nuevo.");
                    }
                } while (numero < 0);
            } catch (InputMismatchException e) {
                System.out.println("Número inválido. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            } catch (Exception e) {
                System.out.println("Ocurrió un error. Intente de nuevo.");
                scanner.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    public static String pedirAtributo() {
        System.out.println("Ingrese el atributo por el cual desea ordenar:");
        System.out.println("1. Nombre o Departamento");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        int opcion = 0;
        do {
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    return "string";
                case 2:
                    return "edad";
                case 3:
                    return "salario";
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion < 1 || opcion > 3);
        return "";
    }
    public static int pedirIndiceEmpleado(ArrayList<Empleado> empleados) {
        int indice = 0;
        do {
            indice = pedirNumero("Ingrese el ID del empleado:");
            if (indice < 0 || indice >= empleados.size()) {
                System.out.println("ID inválido. Intente de nuevo.");
            }
        } while (indice < 0 || indice >= empleados.size());
        return indice;
    }
}
