import java.util.ArrayList;
import java.util.List;

// Clase Actividad
public class Actividad {
    private int id; // identificador de la actividad
    private String titulo; // título de la actividad
    private int cupoMaximo; // cupo máximo de estudiantes
    public static final int CUPO_MINIMO = 1; // constante de cupo mínimo

    private List<Inscripcion> inscripciones; // lista de inscripciones

    // Constructor
    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }

    // Inscribir estudiante en la actividad
    public Inscripcion inscribir(Estudiante estudiante) {
        if (inscripciones.size() < cupoMaximo) {
            Inscripcion inscripcion = new Inscripcion(estudiante);
            inscripciones.add(inscripcion);
            return inscripcion;
        } else {
            System.out.println("No hay cupo disponible en la actividad: " + titulo);
            return null;
        }
    }

    // Mostrar inscripciones
    public void mostrarInscripciones() {
        System.out.println("Actividad: " + titulo + " (ID: " + id + ")");
        for (Inscripcion ins : inscripciones) {
            System.out.println(" - Estudiante: " + ins.getEstudiante().getNombre() + " | Estado: " + ins.getEstado());
        }
    }
}
