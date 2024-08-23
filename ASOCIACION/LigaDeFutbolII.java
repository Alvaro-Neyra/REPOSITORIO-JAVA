import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class LigaDeFutbolII {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        iniciar();
    }   

    public static void iniciar() {
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int opcion = 0;
        do {
            menu();
            opcion = pedirNumero("Introduce una opción: ");
            sc.nextLine();
            switch(opcion) {
                case 1:
                    equipos.add(crearEquipo());
                    break;
                case 2:
                    Jugador nuevoJugador = crearJugador(equipos);
                    jugadores.add(nuevoJugador);
                    break;
                case 3:
                    jugadores = asignarJugadorAEquipo(jugadores, equipos);
                    break;
                case 4:
                    mostrarJugadores(jugadores);
                    break;
                case 5:
                    mostrarListaDeEquipos(equipos);
                    break;
                case 6:
                    eliminarJugador(jugadores);
                    break;
                case 7:
                    eliminarEquipo(equipos, jugadores);
                    break;
                case 8:
                    seleccionarJugador(jugadores, equipos);
                    break;
                case 9:
                    seleccionarEquipo(equipos, jugadores);
                    break;
                case 10:
                    System.out.println("Hasta luego!");
                    break;
            }
        } while (opcion != 10);
    }

    public static void menu() {
        System.out.println("1. Crear equipo");
        System.out.println("2. Crear jugador");
        System.out.println("3. Asignar jugador a equipo");
        System.out.println("4. Mostrar jugadores");
        System.out.println("5. Mostrar equipos");
        System.out.println("6. Eliminar jugador");
        System.out.println("7. Eliminar equipo");
        System.out.println("8. Seleccionar jugador");
        System.out.println("9. Seleccionar equipo");
        System.out.println("10. Salir");
    }

    public static boolean mostrarListaDeEquipos(ArrayList<Equipo> equipos) {
        if (equipos.size() == 0) {
            System.out.println("No hay equipos creados");
            return true;
        }
        boolean noHayEquipos = true;
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i) != null) {
                System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                noHayEquipos = false;
            }
        }
        return noHayEquipos;
    }

    public static Equipo crearEquipo() {
        System.out.println("Nombre del equipo: ");
        String nombre = sc.nextLine();
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        return equipo;
    }

    public static Jugador crearJugador(ArrayList<Equipo> equipos) {
        System.out.println("Nombre del jugador: ");
        String nombre = sc.nextLine();
        Jugador jugador = new Jugador();
        jugador.setNombre(nombre);
        boolean noHayEquipos = mostrarListaDeEquipos(equipos);
        if (noHayEquipos) {
            System.out.println("No hay equipos creados");
        } else {
            int opcion = pedirNumero("Introduce el número del equipo");
            Equipo equipoElegido = equipos.get(opcion - 1);
            jugador.setEquipo(equipoElegido);
        }
        return jugador;
    }

    public static int pedirNumero(String mensaje) {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.println(mensaje);
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero");
                error = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                sc.nextLine();
            }
        } while (error);
        return numero;
    }

    public static void mostrarJugadores(ArrayList<Jugador> jugadores) {
        if (jugadores.size() == 0) {
            System.out.println("No hay jugadores creados");
            return;
        }
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador != null) {
                System.out.print("Jugador " + (i + 1) + ". ");
                System.out.println("Nombre: " + jugador.getNombre());
                if (jugador.getEquipo() != null) {
                    System.out.println("Equipo: " + jugador.getEquipo().getNombre());
                } else {
                    System.out.println("Sin equipo");
                }
            }
        }
    }

    public static ArrayList<Jugador> asignarJugadorAEquipo(ArrayList<Jugador> jugadores, ArrayList<Equipo> equipos) {
        if (jugadores.size() == 0) {
            System.out.println("No hay jugadores creados");
            return jugadores;
        }
        if (equipos.size() == 0) {
            System.out.println("No hay equipos creados");
            return jugadores;
        }
        mostrarJugadores(jugadores);
        int numJugador = pedirNumero("Introduce el número del jugador");
        mostrarListaDeEquipos(equipos);
        int numEquipo = pedirNumero("Introduce el número del equipo");
        jugadores.get(numJugador - 1).setEquipo(equipos.get(numEquipo - 1));
        System.out.println("Jugador asignado al equipo!");
        return jugadores;
    }

    public static void eliminarJugador(ArrayList<Jugador> jugadores) {
        mostrarJugadores(jugadores);

        int numJugador = pedirNumero("Introduce el número del jugador");
        jugadores.remove(numJugador - 1);
        System.out.println("Jugador eliminado!");
    }

    public static void eliminarEquipo(ArrayList<Equipo> equipos, ArrayList<Jugador> jugadores) {
        mostrarListaDeEquipos(equipos);
        int numEquipo = pedirNumero("Introduce el número del equipo");
        equipos.remove(numEquipo - 1);
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getEquipo() == null) {
                continue;
            }
            if (jugador.getEquipo().getNombre().equals(equipos.get(numEquipo - 1).getNombre())) {
                jugador.setEquipo(null);
            }
        }
        System.out.println("Equipo eliminado!");
    }

    public static void seleccionarEquipo(ArrayList<Equipo> equipos, ArrayList<Jugador> jugadores) {
        int opcion = 0;
        mostrarListaDeEquipos(equipos);
        int numEquipo = pedirNumero("Introduce el número del equipo");
        System.out.println("Equipo seleccionado: " + equipos.get(numEquipo - 1).getNombre());
        do {
            menuEquipo();
            opcion = pedirNumero("Introduce una opción: ");
            sc.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("Nombre del equipo: " + equipos.get(numEquipo - 1).getNombre());
                    break;
                case 2:
                    System.out.println("Introduce el nuevo nombre del equipo: ");
                    String nuevoNombre = sc.nextLine();
                    equipos.get(numEquipo - 1).setNombre(nuevoNombre);
                    System.out.println("Nombre del equipo actualizado!");
                    break;
                case 3:
                    mostrarJugadores(jugadores);
                    int numJugador = pedirNumero("Introduce el número del jugador");
                    jugadores.get(numJugador - 1).setEquipo(equipos.get(numEquipo - 1));
                    System.out.println("Jugador asignado al equipo!");
                    break;
                case 4:
                    mostrarJugadoresDeEquipo(jugadores, equipos.get(numEquipo - 1));
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
            }
        } while (opcion != 5);
    }

    public static void menuJugador() {
        System.out.println("1. Ver detalles");
        System.out.println("2. Cambiar nombre");
        System.out.println("3. Cambiar equipo");
        System.out.println("4. Regresar al menú principal");
    }

    public static void menuEquipo() {
        System.out.println("1. Ver detalles");
        System.out.println("2. Cambiar nombre");
        System.out.println("3. Agregar jugador al equipo");
        System.out.println("4. Mostrar jugadores del equipo");
        System.out.println("5. Regresar al menú principal");
    }

    public static void mostrarJugadoresDeEquipo(ArrayList<Jugador> jugadores, Equipo equipo) {
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            if (jugador.getEquipo() != null && jugador.getEquipo().getNombre().equals(equipo.getNombre())) {
                System.out.println("Jugador " + (i + 1) + ". " + jugador.getNombre());
            }
        }
    }

    public static void seleccionarJugador(ArrayList<Jugador> jugadores, ArrayList<Equipo> equipos) {
        int opcion = 0;
        mostrarJugadores(jugadores);
        int numJugador = pedirNumero("Introduce el número del jugador");
        System.out.println("Jugador seleccionado: " + jugadores.get(numJugador - 1).getNombre());
        do {
            menuJugador();
            opcion = pedirNumero("Introduce una opción: ");
            sc.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("Nombre del jugador: " + jugadores.get(numJugador - 1).getNombre());
                    if (jugadores.get(numJugador - 1).getEquipo() != null) {
                        System.out.println("Equipo: " + jugadores.get(numJugador - 1).getEquipo().getNombre());
                    } else {
                        System.out.println("Sin equipo");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el nuevo nombre del jugador: ");
                    String nuevoNombre = sc.nextLine();
                    jugadores.get(numJugador - 1).setNombre(nuevoNombre);
                    System.out.println("Nombre del jugador actualizado!");
                    break;
                case 3:
                    cambiarEquipoAJugador(numJugador, equipos, jugadores);
                    break;
                case 4:
                    System.out.println("Regresando...");
                    break;
            }
        } while (opcion != 4);
    }

    public static void cambiarEquipoAJugador(int numJugador, ArrayList<Equipo> equipos, ArrayList<Jugador> jugadores) {
        mostrarListaDeEquipos(equipos);
        int numEquipo = pedirNumero("Introduce el número del equipo");
        jugadores.get(numJugador - 1).setEquipo(equipos.get(numEquipo - 1));
        System.out.println("Equipo asignado al jugador!");
    }
}

class Jugador {
    private String nombre;
    private Equipo equipo;

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}

class Equipo {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}