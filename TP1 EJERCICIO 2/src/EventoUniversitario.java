import java.util.ArrayList;
import java.util.List;

// Clase que modela un Evento Universitario
public class EventoUniversitario {
    private final String id; // identificador único del evento
    private String titulo;   // título del evento
    private double costoBase; // costo base del evento
    private boolean gratuito; // indica si es gratuito
    private static int cantidadEventos = 0; // contador estático de eventos

    private Sala sala; // relación de agregación con Sala
    private List<Actividad> actividades; // relación de composición con Actividades

    // Constructor principal
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>(); // inicializa lista de actividades
        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.actividades = new ArrayList<>(otro.actividades);
        this.sala = otro.sala;
        cantidadEventos++;
    }

    // Asignar sala al evento
    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    // Crear actividad y agregarla al evento
    public void crearActividad(int id, String titulo, int cupo) {
        Actividad actividad = new Actividad(id, titulo, cupo);
        actividades.add(actividad);
    }

    // Getter para acceder a la lista de actividades (soluciona tu error)
    public List<Actividad> getActividades() {
        return actividades;
    }

    // Mostrar datos del evento
    public void mostrarDatos() {
        System.out.println("Evento: " + titulo + " (ID: " + id + ")");
        System.out.println("Costo base: $" + costoBase + " | Gratuito: " + (gratuito ? "Sí" : "No"));
        if (sala != null) {
            System.out.println("Sala asignada: " + sala.getNombre());
        }
        System.out.println("Actividades:");
        for (Actividad act : actividades) {
            act.mostrarInscripciones();
        }
        System.out.println("-----------------------------");
    }

    // Cantidad total de eventos creados
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
