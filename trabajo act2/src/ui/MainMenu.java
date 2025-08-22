package ui;

import java.util.Scanner;

import lista.S_enlazadas;
import lista.D_enlazadas;
import lista.C_enlazadas;
import data.DataTypeExample;

public class MainMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Listas principales
        S_enlazadas listaReservas = new S_enlazadas();
        D_enlazadas listaComida = new D_enlazadas();
        C_enlazadas listaProveedores = new C_enlazadas();

        int opcion;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestionar Reservaciones (Lista Simple)");
            System.out.println("2. Gestionar Menú de Comida (Lista Doble)");
            System.out.println("3. Gestionar Proveedores (Lista Circular)");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> submenuReservas(sc, listaReservas);
                case 2 -> submenuComida(sc, listaComida);
                case 3 -> submenuProveedores(sc, listaProveedores);
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // ===== SUBMENÚ RESERVAS (Lista Simple) =====
    private static void submenuReservas(Scanner sc, S_enlazadas lista) {
        int opcion;
        do {
            System.out.println("\n--- Submenú Reservas ---");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Ver reservas");
            System.out.println("3. Buscar reserva");
            System.out.println("4. Eliminar reserva");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int tel = sc.nextInt();
                    System.out.print("Mesa: ");
                    int mesa = sc.nextInt();
                    sc.nextLine();
                    lista.insertar(new DataTypeExample(nombre, tel, mesa));
                }
                case 2 -> lista.ver();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = sc.nextLine();
                    lista.buscar(nombre);
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = sc.nextLine();
                    lista.eliminar(nombre);
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // ===== SUBMENÚ COMIDA (Lista Doble) =====
    private static void submenuComida(Scanner sc, D_enlazadas lista) {
        int opcion;
        do {
            System.out.println("\n--- Submenú Comida ---");
            System.out.println("1. Agregar platillo");
            System.out.println("2. Ver menú");
            System.out.println("3. Buscar platillo");
            System.out.println("4. Eliminar platillo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del platillo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    lista.insertar(new DataTypeExample(nombre, desc, precio));
                }
                case 2 -> lista.ver();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = sc.nextLine();
                    lista.buscar(nombre);
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = sc.nextLine();
                    lista.eliminar(nombre);
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // ===== SUBMENÚ PROVEEDORES (Lista Circular) =====
    private static void submenuProveedores(Scanner sc, C_enlazadas lista) {
        int opcion;
        do {
            System.out.println("\n--- Submenú Proveedores ---");
            System.out.println("1. Agregar proveedor");
            System.out.println("2. Ver proveedores");
            System.out.println("3. Buscar proveedor");
            System.out.println("4. Eliminar proveedor");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre proveedor: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    int tel = sc.nextInt();
                    sc.nextLine();
                    lista.insertar(new DataTypeExample(nombre, tel));
                }
                case 2 -> lista.ver();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = sc.nextLine();
                    lista.buscar(nombre);
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = sc.nextLine();
                    lista.eliminar(nombre);
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
