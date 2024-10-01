package clases;

import java.util.*;

public class ClasesMap {
    private Scanner leer;
    private Map<String, List<Double>> alumnosH = new HashMap<>();
    private Map<String, List<Double>> alumnosT = new TreeMap<>();

    public ClasesMap() {
        leer = new Scanner(System.in);
        alumnosH = new HashMap<>();
        alumnosT = new TreeMap<>();
    }

    // Método para ingresar alumnos y sus notas en HashMap
    public void setAlumnosH() {
        System.out.println("Ingrese 5 alumnos y 3 notas por alumno en HashMap:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            List<Double> notas = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas.add(leer.nextDouble());
            }
            leer.nextLine();  // Limpiar el buffer
            alumnosH.put(nombre, notas);
        }
    }

    // Método para ingresar alumnos y sus notas en TreeMap
    public void setAlumnosT() {
        System.out.println("Ingrese 5 alumnos y 3 notas por alumno en TreeMap:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            List<Double> notas = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + ": ");
                notas.add(leer.nextDouble());
            }
            leer.nextLine();  // Limpiar el buffer
            alumnosT.put(nombre, notas);
        }
    }

    // Obtener alumnos y notas de HashMap
    public Map<String, List<Double>> getAlumnosH() {
        return alumnosH;
    }

    // Obtener alumnos y notas de TreeMap
    public Map<String, List<Double>> getAlumnosT() {
        return alumnosT;
    }

    // Mostrar solo los nombres de los alumnos en HashMap
    public void mostrarClavesH() {
        System.out.println("Nombres de los alumnos en HashMap:");
        for (String nombre : alumnosH.keySet()) {
            System.out.println(nombre);
        }
    }

    // Mostrar solo los nombres de los alumnos en TreeMap
    public void mostrarClavesT() {
        System.out.println("Nombres de los alumnos en TreeMap:");
        for (String nombre : alumnosT.keySet()) {
            System.out.println(nombre);
        }
    }

    // Buscar un alumno en HashMap
    public void buscarAlumnoH(String nombre) {
        if (alumnosH.containsKey(nombre)) {
            System.out.println("Alumno encontrado: " + nombre + " - Notas: " + alumnosH.get(nombre));
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    // Buscar un alumno en TreeMap
    public void buscarAlumnoT(String nombre) {
        if (alumnosT.containsKey(nombre)) {
            System.out.println("Alumno encontrado: " + nombre + " - Notas: " + alumnosT.get(nombre));
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    // Eliminar un alumno en HashMap
    public void eliminarAlumnoH(String nombre) {
        if (alumnosH.containsKey(nombre)) {
            alumnosH.remove(nombre);
            System.out.println("Alumno eliminado: " + nombre);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    // Eliminar un alumno en TreeMap
    public void eliminarAlumnoT(String nombre) {
        if (alumnosT.containsKey(nombre)) {
            alumnosT.remove(nombre);
            System.out.println("Alumno eliminado: " + nombre);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
