import java.time.LocalDate;

// Clase Inscripcion
public class Inscripcion {
    private LocalDate fecha; // fecha de inscripción
    private String estado; // estado de inscripción
    private Estudiante estudiante; // estudiante inscripto

    // Constructor
    public Inscripcion(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.fecha = LocalDate.now();
        this.estado = "Inscripto";
    }

    // Getter para estudiante
    public Estudiante getEstudiante() {
        return estudiante;
    }

    // Getter para estado
    public String getEstado() {
        return estado;
    }
}
