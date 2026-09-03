// Clase Estudiante
public class Estudiante {
    private String legajo; // legajo del estudiante
    private String nombre; // nombre del estudiante

    // Constructor
    public Estudiante(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }
}
