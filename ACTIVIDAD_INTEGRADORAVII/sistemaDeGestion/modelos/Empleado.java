package sistemaDeGestion.modelos;
import java.util.Scanner;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado() {
        this.nombre = "";
        this.edad = 0;
        this.salario = 0.0;
        this.departamento = "";
        Empleado.contadorEmpleados++;
    }

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
        Empleado.contadorEmpleados++;
    }

    public static void mostrarEmpleados(ArrayList<Empleado> empleados) {
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        System.out.println("Cantidad de empleados: " + Empleado.getContadorEmpleados());
        System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
        }
    }

    public static boolean filtrarEmpleados(ArrayList<Empleado> empleados, String valorCadena) {
        Scanner scanner = new Scanner(System.in);
        boolean filtrado = false;
        System.out.print("Deseas filtrar por nombre o departamento? Escribe (nombre o departamento)");
        String atributoCadenaAFiltrar = scanner.nextLine();
        System.out.println("Filtrados por " + atributoCadenaAFiltrar + " igual a " + valorCadena);
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        if (atributoCadenaAFiltrar.equals("nombre")) {
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i).getNombre().equals(valorCadena)) {
                    System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                    System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
                    filtrado = true;
                }
            }
        } else if (atributoCadenaAFiltrar.equals("departamento")) {
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i).getDepartamento().equals(valorCadena)) {
                    System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                    System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
                    filtrado = true;
                }
            }
        } else {
            System.out.println("No se ha encontrado el atributo a filtrar");
        }
        scanner.close();

        return filtrado;
    }

    public static void filtrarEmpleados(ArrayList<Empleado> empleados, int edadAFiltrar) {
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        System.out.println("Filtrados por edad " + edadAFiltrar);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEdad() == edadAFiltrar) {
                System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
            }
        }
    }

    public static void filtrarEmpleados(ArrayList<Empleado> empleados, double salarioAFiltrar) {
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        System.out.println("Filtrados por salario igual a " + salarioAFiltrar);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getSalario() == salarioAFiltrar) {
                System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
            }
        }
    }

    public static void filtrarEmpleados(ArrayList<Empleado> empleados, double salarioMinimo, double salarioMaximo) {
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        System.out.println("Filtrados por salario entre " + salarioMinimo + " y " + salarioMaximo);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getSalario() >= salarioMinimo && empleados.get(i).getSalario() <= salarioMaximo) {
                System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
            }
        }
    }

    public static void filtrarEmpleados(ArrayList<Empleado> empleados, int edadMinima, int edadMaxima) {
        // Como una tabla con filas numeradas y columnas separadas por tabulaciones
        System.out.println("Filtrados por edad entre " + edadMinima + " y " + edadMaxima);
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEdad() >= edadMinima && empleados.get(i).getEdad() <= edadMaxima) {
                System.out.println("ID\tNombre\tEdad\tSalario\tDepartamento");
                System.out.println(i + "\t" + empleados.get(i).getNombre() + "\t" + empleados.get(i).getEdad() + "\t" + empleados.get(i).getSalario() + "\t" + empleados.get(i).getDepartamento());
            }
        }
    }

    public static int getContadorEmpleados() {
        return Empleado.contadorEmpleados;
    }

    public static ArrayList<Empleado> ordenarPorAtributo(ArrayList<Empleado> empleados, String atributo) {
        if (atributo.equals("nombre")) {
            empleados.sort((Empleado e1, Empleado e2) -> e1.getNombre().compareTo(e2.getNombre()));
        } else if (atributo.equals("edad")) {
            empleados.sort((Empleado e1, Empleado e2) -> e1.getEdad() - e2.getEdad());
        } else if (atributo.equals("salario")) {
            empleados.sort((Empleado e1, Empleado e2) -> (int) (e1.getSalario() - e2.getSalario()));
        } else if (atributo.equals("departamento")) {
            empleados.sort((Empleado e1, Empleado e2) -> e1.getDepartamento().compareTo(e2.getDepartamento()));
        } else {
            System.out.println("No se ha encontrado el atributo a ordenar");
        }
        return empleados;
    }

    public static Empleado buscarPorNombre(ArrayList<Empleado> empleados, String nombre) {
        Empleado empleado = null;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                empleado = empleados.get(i);
                break;
            }
        }
        return empleado;
    }

    public static Empleado incrementarSalario (Empleado empleado, double porcentaje) {
        double salarioIncrementado = empleado.getSalario() + empleado.getSalario() * porcentaje / 100;
        empleado.setSalario(salarioIncrementado);
        return empleado;
    }

    // Getters y Setters
    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
