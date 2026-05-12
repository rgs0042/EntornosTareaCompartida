import java.util.Scanner;

/**
 * Clase principal que lanza la aplicación de consola.
 * Coordina la interacción entre el usuario y el sistema de gestión de habitaciones.
 * 
 * @author Joseka
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada principal de la aplicación.
     * Gestiona el bucle del menú y las entradas del usuario por teclado.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Inicialización del gestor de datos y el lector de teclado
        GestorReservas gestor = new GestorReservas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("--- BIENVENIDO A JAVA HOTEL ---");

        /**
         * Ejecuta el ciclo de vida del menú hasta que el usuario elija la opción de salida.
         */
        do {
            System.out.println("\n1. Ver disponibles\n2. Reservar\n3. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            // Opción 1: Listado de habitaciones libres
            if (opcion == 1) {
                System.out.println("Habitaciones libres:");
                gestor.obtenerDisponibles().forEach(h -> 
                    System.out.println("Nº " + h.getNumero() + " - " + h.getPrecioBase() + "€"));
            
            // Opción 2: Proceso de reserva por número de habitación
            } else if (opcion == 2) {
                System.out.print("Introduce número de habitación: ");
                int num = sc.nextInt();
                
                // Intenta realizar la reserva y comunica el resultado al usuario
                if (gestor.reservar(num)) {
                    System.out.println("¡Reserva confirmada!");
                } else {
                    System.out.println("Error: Habitación no disponible.");
                }
            }
            
        } while (opcion != 3);

        // Cierre de recursos y finalización
        sc.close();
        System.out.println("Saliendo del sistema...");
    }
}