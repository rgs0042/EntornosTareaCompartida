
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona la disponibilidad y el registro de reservas.
 * @author Rafa
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

}
