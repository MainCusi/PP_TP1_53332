import java.time.LocalDate;

// Clase Inscripcion
public class Inscripcion {
    private LocalDate fecha; // fecha de inscripción
    private String estado;   // estado de inscripción
    private Estudiante estudiante; // estudiante inscripto

    // Constructor: recibe un estudiante y crea la inscripción
    public Inscripcion(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.fecha = LocalDate.now(); // fecha actual
        this.estado = "Inscripto";    // estado inicial
    }

    // Getter para estudiante
    public Estudiante getEstudiante() {
        return estudiante;
    }

    // Getter para estado
    public String getEstado() {
        return estado;
    }

    // Getter para fecha
    public LocalDate getFecha() {
        return fecha;
    }

    // Mostrar datos de inscripción
    public void mostrarDatos() {
        System.out.println("Inscripción: " + estudiante.getNombre() + " | Fecha: " + fecha + " | Estado: " + estado);
    }
}
