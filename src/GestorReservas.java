
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona la disponibilidad y el registro de reservas.
 * @author rafa y Carlos javi
 */
public class GestorReservas {
    private List<Habitacion> habitaciones;

    public GestorReservas() {
        habitaciones = new ArrayList<>();
        // Datos de prueba
        habitaciones.add(new Habitacion(101, "Simple", 50.0));
        habitaciones.add(new Habitacion(102, "Doble", 80.0));
        habitaciones.add(new Habitacion(201, "Suite", 150.0));
    }

    /**
     * Busca habitaciones libres.
     * REFACTORIZACIÓN: Se usa un método específico para filtrar (Clean Code).
     * @return Lista de habitaciones disponibles.
     */
    public List<Habitacion> obtenerDisponibles() {
        List<Habitacion> libres = new ArrayList<>();
        for (Habitacion h : habitaciones) {
            if (!h.isOcupada()) {
                libres.add(h);
            }
        }
        return libres;
    }

    /**
     * Realiza el proceso de reserva.
     * @param numeroHabitacion El ID de la habitación.
     * @return true si se pudo reservar, false si ya estaba ocupada.
     */ 

          public boolean reservar(int numeroHabitacion) {
            for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion && !h.isOcupada()) {
                h.setOcupada(true);
                return true;
            }
        }
        return false;
    }
}