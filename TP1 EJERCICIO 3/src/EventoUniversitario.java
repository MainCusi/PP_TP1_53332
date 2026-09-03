import java.util.ArrayList;
import java.util.List;

// Clase que modela un Evento Universitario
public class EventoUniversitario {
    private final String id; // identificador único
    private String titulo;   // título del evento
    private double costoBase; // costo base
    private boolean gratuito; // indica si es gratuito
    private static int cantidadEventos = 0; // contador estático

    private Sala sala; // relación de agregación
    private List<Actividad> actividades; // relación de composición

    // Constructor principal
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
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

    // Asignar sala
    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    // Crear actividad según tipo ("Charla" o "Taller")
    public void crearActividad(int id, String titulo, int cupo, String tipo, boolean requiereNotebook) {
        Actividad actividad;
        if (tipo.equalsIgnoreCase("Charla")) {
            actividad = new Charla(id, titulo, cupo);
        } else if (tipo.equalsIgnoreCase("Taller")) {
            actividad = new Taller(id, titulo, cupo, requiereNotebook);
        } else {
            System.out.println("Tipo de actividad no válido: " + tipo);
            return;
        }
        actividades.add(actividad);
    }

    // Calcular costo estimado del evento
    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0;
        }
        double totalActividades = 0;
        for (Actividad act : actividades) {
            totalActividades += act.calcularCostoMateriales();
        }
        return (costoBase + totalActividades) * 1.21; // incluye 21% impuestos
    }

    // Getter de actividades
    public List<Actividad> getActividades() {
        return actividades;
    }

    // Mostrar datos del evento
    public void mostrarDatos() {
        System.out.println("Evento: " + titulo + " (ID: " + id + ")");
        System.out.println("Costo estimado total: $" + calcularCostoEstimado());
        if (sala != null) {
            System.out.println("Sala asignada: " + sala.getNombre());
        }
        System.out.println("Actividades:");
        for (Actividad act : actividades) {
            act.mostrarIdentificacion(); // polimórfico
            act.mostrarInscripciones();
        }
        System.out.println("-----------------------------");
    }

    // Cantidad total de eventos
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
