
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona la disponibilidad y el registro de reservas.
 * @author rafa
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
}