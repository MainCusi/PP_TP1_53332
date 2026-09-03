// Clase Estudiante
public class Estudiante {
    private String legajo; // legajo único del estudiante
    private String nombre; // nombre del estudiante

    // Constructor
    public Estudiante(String legajo, String nombre) {
        this.legajo = legajo; // asigna legajo
        this.nombre = nombre; // asigna nombre
    }

    // Getter para legajo
    public String getLegajo() {
        return legajo;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método para mostrar datos del estudiante
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " (Legajo: " + legajo + ")");
    }
}
