package principal;

import clases.ClasesMap;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ClasesMap coleccionMap = new ClasesMap();
        int op;

        do {
            System.out.println("MENU COLECCIONES");
            System.out.println("------------------------");
            System.out.println("1) Ingresar notas en una colección HashMap.");
            System.out.println("2) Ingresar notas en una colección TreeMap.");
            System.out.println("3) Mostrar Alumnos y notas colección HashMap.");
            System.out.println("4) Mostrar Alumnos y notas colección TreeMap.");
            System.out.println("5) Mostrar solo los nombres de los alumnos (HashMap).");
            System.out.println("6) Buscar alumno en HashMap.");
            System.out.println("7) Eliminar alumno en HashMap.");
            System.out.println("8) Mostrar solo los nombres de los alumnos (TreeMap).");
            System.out.println("9) Buscar alumno en TreeMap.");
            System.out.println("10) Eliminar alumno en TreeMap.");
            System.out.println("11) Salir.");
            System.out.println("Digite la opción: ");
            op = leer.nextInt();
            leer.nextLine();  // Limpiar el buffer
            switch (op) {
                case 1:
                    coleccionMap.setAlumnosH();
                    break;
                case 2:
                    coleccionMap.setAlumnosT();
                    break;
                case 3:
                    System.out.println(coleccionMap.getAlumnosH());
                    break;
                case 4:
                    System.out.println(coleccionMap.getAlumnosT());
                    break;
                case 5:
                    coleccionMap.mostrarClavesH();
                    break;
                case 6:
                    System.out.println("Ingrese el nombre del alumno a buscar (HashMap):");
                    String alumnoBuscarH = leer.nextLine();
                    coleccionMap.buscarAlumnoH(alumnoBuscarH);
                    break;
                case 7:
                    System.out.println("Ingrese el nombre del alumno a eliminar (HashMap):");
                    String alumnoEliminarH = leer.nextLine();
                    coleccionMap.eliminarAlumnoH(alumnoEliminarH);
                    break;
                case 8:
                    coleccionMap.mostrarClavesT();
                    break;
                case 9:
                    System.out.println("Ingrese el nombre del alumno a buscar (TreeMap):");
                    String alumnoBuscarT = leer.nextLine();
                    coleccionMap.buscarAlumnoT(alumnoBuscarT);
                    break;
                case 10:
                    System.out.println("Ingrese el nombre del alumno a eliminar (TreeMap):");
                    String alumnoEliminarT = leer.nextLine();
                    coleccionMap.eliminarAlumnoT(alumnoEliminarT);
                    break;
                case 11:
                    System.out.println("Goodbye...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (op != 11);
    }
}
