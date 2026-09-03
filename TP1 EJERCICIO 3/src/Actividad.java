import java.util.ArrayList;
import java.util.List;

// Clase abstracta Actividad
public abstract class Actividad {
    protected int id; // identificador
    protected String titulo; // título
    protected int cupoMaximo; // cupo máximo
    public static final int CUPO_MINIMO = 1; // constante

    protected List<Inscripcion> inscripciones; // lista de inscripciones

    // Constructor
    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>(); // inicializa lista
    }


    // Método final: no puede redefinirse en subclases
    public final void mostrarIdentificacion() {
        System.out.println("Actividad: " + titulo + " (ID: " + id + ") | Tipo: " + getTipo());
    }

    // Método abstracto: cada subclase define su costo
    public abstract double calcularCostoMateriales();

    // Método abstracto: cada subclase define su tipo
    public abstract String getTipo();

    // Inscribir estudiante
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
        for (Inscripcion ins : inscripciones) {
            System.out.println(" - Estudiante: " + ins.getEstudiante().getNombre() + " | Estado: " + ins.getEstado());
        }
    }
}
