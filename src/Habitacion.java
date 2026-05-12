
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

     // Getters y Setters
    public int getNumero() { return numero; }
    public boolean isOcupada() { return estaOcupada; }
    public void setOcupada(boolean estado) { this.estaOcupada = estado; }
    public double getPrecioBase() { return precioBase; }
        
        
       
}
