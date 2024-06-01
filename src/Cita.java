import java.time.LocalDate;

public class Cita {

    private int id;
    private LocalDate fecha;
    private String motivo;
    private String hora;
    private String nombrePaciente;

    public Cita(int id, LocalDate fecha, String nombrePaciente, String motivo, String hora) {
        this.id = id;
        this.fecha = fecha;
        this.nombrePaciente = nombrePaciente;
        this.motivo = motivo;
        this.hora = hora;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    // Método para crear una cita
    public static void crearCita(int id, LocalDate fecha, String nombrePaciente, String motivo, String hora) {
        Cita nuevaCita = new Cita(id, fecha, nombrePaciente, motivo, hora);
        // Aquí se debería implementar la lógica para almacenar la cita en una base de datos o en otra estructura de datos.
        System.out.println("Se ha creado la cita: " + nuevaCita.getId() + " para " + nuevaCita.getNombrePaciente() + " el " + nuevaCita.getFecha() + " a las " + nuevaCita.getHora() + " con motivo: " + nuevaCita.getMotivo());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        crearCita(1, LocalDate.of(2024, 5, 31), "Juan Pérez", "Revisión general", "10:00");
        crearCita(2, LocalDate.of(2024, 6, 10), "Ana López", "Control de presión arterial", "14:30");
        crearCita(3, LocalDate.of(2024, 6, 15), "Carlos Gómez", "Limpieza dental", "09:00");
    }
}
