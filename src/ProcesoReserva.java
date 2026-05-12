
import java.util.Scanner;

/**
 * Clase principal que lanza la aplicación de consola.
 * @author Carlos Javier Millán Villarejo
 */
public class ProcesoReserva {
    public static void main(String[] args) throws Exception {
        
       /**
     * Realiza el proceso de reserva.
     * @param numeroHabitacion El ID de la habitación.
     * @return true si se pudo reservar, false si ya estaba ocupada.
     */ 

          // Método que devuelve true si la reserva se cumplió o false si falló
          public boolean reservar(int numeroHabitacion) {

            // Bucle for-each, ecorre uno por uno los objetos 'Habitacion' en la lista 'habitaciones'
            for (Habitacion h : habitaciones) {
            
                // Comprueba que el número de la habitación actual sea el que buscamos y que la habitación no esté ocupada 
                if (h.getNumero() == numeroHabitacion && !h.isOcupada()) {
               
                // Si ambas condiciones se cumplen, marcamos la habitación como ocupada
                h.setOcupada(true);
                
                // Salimos devolviendo true
                return true;
            }
        }
         
        // Si el bucle termina y no se encontró la habitación o estaba ocupada, devuelve false
        return false;
    }

      
    }
}
