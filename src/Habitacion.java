
import java.util.Scanner;

/**
 * Clase principal que lanza la aplicación de consola.
 * @author Antonio García
 */

    public class Habitacion {
        private int numero;
        private String tipo; // Simple, Doble, Suite
        private double precioBase;
        private boolean estaOcupada;
    
        // Constructor
    public Habitacion(int numero, String tipo, double precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estaOcupada = false;
    }
        
        
       
}
