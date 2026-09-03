import java.util.ArrayList;
import java.util.List;

// Clase principal para probar el sistema
public class App {
    public static void main(String[] args) {
        // Crear lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("S001", "Juan Pérez"));
        estudiantes.add(new Estudiante("S002", "María Gómez"));
        estudiantes.add(new Estudiante("S003", "Carlos López"));

        // Crear evento
        EventoUniversitario evento = new EventoUniversitario("E001", "Jornada de Programación", 1500, false);

        // Asignar sala al evento
        Sala sala = new Sala(1, "Aula Magna");
        evento.asignarSala(sala);

        // Crear actividades
        evento.crearActividad(101, "Charla de Java", 2);
        evento.crearActividad(102, "Taller de POO", 3);

        // Inscribir estudiantes en actividades usando el getter
        Actividad charla = evento.getActividades().get(0);
        Actividad taller = evento.getActividades().get(1);

        charla.inscribir(estudiantes.get(0));
        charla.inscribir(estudiantes.get(1));

        taller.inscribir(estudiantes.get(1));
        taller.inscribir(estudiantes.get(2));

        // Mostrar resumen del evento
        evento.mostrarDatos();

        // Mostrar cantidad total de eventos creados
        System.out.println("Cantidad total de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}
