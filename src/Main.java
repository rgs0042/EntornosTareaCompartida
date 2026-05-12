import java.util.Scanner;

/**
 * Clase principal que lanza la aplicación de consola.
 * @author Joseka
 */
public class Main {
    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("--- BIENVENIDO A JAVA HOTEL ---");
        do {
            System.out.println("\n1. Ver disponibles\n2. Reservar\n3. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Habitaciones libres:");
                gestor.obtenerDisponibles().forEach(h -> 
                    System.out.println("Nº " + h.getNumero() + " - " + h.getPrecioBase() + "€"));
            } else if (opcion == 2) {
                System.out.print("Introduce número de habitación: ");
                int num = sc.nextInt();
                if (gestor.reservar(num)) {
                    System.out.println("¡Reserva confirmada!");
                } else {
                    System.out.println("Error: Habitación no disponible.");
                }
            }
        } while (opcion != 3);
    }
}