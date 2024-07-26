import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alumno alumnos[] = new Alumno[10];
        int opcion = 0;

        do {

            opcion = elegirOpcion(sc);

            switch (opcion) {
                case 0:
                    agregarAlumno(sc, alumnos);
                    break;
                case 1:
                    mostrarAlumnos(alumnos);
                    break;
                case 2:
                    mostrarPromedio(alumnos);
                    break;
                case 3:
                    buscarAlumno(sc, alumnos);
                    break;
                case 4:
                    modificarNota(sc, alumnos);
                    break;
                case 5:
                    EliminarAlumno(sc, alumnos);
                    break;
                default:
                    break;
            }
        } while (opcion != 6);

        sc.close();
    }

    public static class Alumno {
        private String nombre;
        private double nota;

        public Alumno(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        public String getNombre() {
            return nombre;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }
    }

    public static void mostrarMenu() {
        System.out.println("0 - Agregar alumno");
        System.out.println("1 - Mostrar todos los alumnos");
        System.out.println("2 - Mostrar promedio de notas");
        System.out.println("3 - Buscar alumno por nombre");
        System.out.println("4 - Modificar nota por nombre");
        System.out.println("5 - Eliminar alumno por nombre");
        System.out.println("6 - Sair");
    }

    public static int elegirOpcion(Scanner sc) {
        int opcion = 0;
        boolean error = true;
        do {
            mostrarMenu();
            try {
                do {
                    System.out.print("Ingrese una opción: ");
                    opcion = sc.nextInt();
                } while (opcion < 0 || opcion > 6);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("La opción debe ser un número.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al leer la opción. Intente nuevamente.");
                sc.nextLine();
            }
        } while (error);
        return opcion;
    }

    public static void agregarAlumno(Scanner sc, Alumno alumnos[]) {
        boolean nombreExiste = false;
        String nombre = "";
        double nota = 0;
        sc.nextLine(); // Limpiar el buffer luego de la anterior lectura
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = sc.nextLine();
            nombre = nombre.trim();
            nombre = nombre.toUpperCase();
            if (verificarNombre(alumnos, nombre)) {
                nombreExiste = true;
                System.out.println("El nombre ya existe. Intente nuevamente.");
            } else {
                nombreExiste = false;
            }
        } while (nombreExiste);

        boolean error = true;

        do {
            try {
                do {
                    System.out.print("Ingrese la nota del alumno (entre el 0 y 10): ");
                    nota = sc.nextDouble();
                } while (nota < 0 || nota > 10);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("La nota debe ser un número.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error al leer la nota. Intente nuevamente.");
                sc.nextLine();
            }
        } while (error);
            
        sc.nextLine(); // Limpiar el buffer luego de leer el numero

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno(nombre, nota);
                break;
            }
        }
    }

    public static boolean verificarNombre(Alumno alumnos[], String nombre) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarAlumnos(Alumno alumnos[]) {
        System.out.println("Lista de alumnos y sus notas:");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.println(alumnos[i].getNombre() + ": " + alumnos[i].getNota());
            }
        }
    }

    public static void mostrarPromedio(Alumno alumnos[]) {
        double suma = 0;
        int cantidadAlumnos = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                suma += alumnos[i].getNota();
                cantidadAlumnos++;
            }
        }
        double promedio = suma / cantidadAlumnos;
        System.out.println("Promedio de las notas: " + promedio);
    }

    public static void buscarAlumno(Scanner sc, Alumno alumnos[]) {
        sc.nextLine(); // Limpiar el buffer luego de la anterior lectura
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = sc.nextLine();
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombre)) {
                System.out.println("Alumno encontrado: " + alumnos[i].getNombre() + " - Nota : " + alumnos[i].getNota());
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void modificarNota(Scanner sc, Alumno alumnos[]) {
        sc.nextLine(); // Limpiar el buffer luego de la anterior lectura
        System.out.print("Ingrese el nombre del alumno a cambiar la nota: ");
        String nombre = sc.nextLine();
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombre)) {
                boolean error = true;
                double nota = 0;
                do {
                    try {
                        do {
                            System.out.print("Ingrese la nueva nota del alumno (entre el 0 y 10): ");
                            nota = sc.nextDouble();
                        } while (nota < 0 || nota > 10);
                        error = false;
                    } catch (InputMismatchException e) {
                        System.out.println("La nota debe ser un número.");
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("Error al leer la nota. Intente nuevamente.");
                        sc.nextLine();
                    }
                } while (error);
                alumnos[i].setNota(nota);
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public static void EliminarAlumno(Scanner sc, Alumno alumnos[]) {
        sc.nextLine(); // Limpiar el buffer luego de la anterior lectura
        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        String nombre = sc.nextLine();
        nombre = nombre.trim();
        nombre = nombre.toUpperCase();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombre)) {
                alumnos[i] = null;
                System.out.println("Alumno eliminado.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
}