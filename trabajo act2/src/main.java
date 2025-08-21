import java.util.Scanner;
//esta clase es para el menu principal y que se corra el programa
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO AL RESTAURANT, \n PORFAVOR SELECCIONE UNA OPCION.:");
        System.out.println("1. RESERVACIONES AL CLIENTE (SIMPLEMENTE ENLAZADAS)");
        System.out.println("2. MENU DE COMIDA (DOBLEMENTE ENLAZADAS)");
        System.out.println("3. CONTACTAR PROVEEDORES (CIRCULAR)");
        System.out.println("4. SALIR Y NO COMER NADA (jaja jodidos no les alcanzo)");
        System.out.println("ingrese su seleccion:");
        int choise = scanner.nextInt();
    }
}
