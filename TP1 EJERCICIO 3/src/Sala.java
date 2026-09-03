// Clase Sala
public class Sala {
    private int id;       // identificador de la sala
    private String nombre; // nombre de la sala

    // Constructor
    public Sala(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método para mostrar datos de la sala
    public void mostrarDatos() {
        System.out.println("Sala: " + nombre + " (ID: " + id + ")");
    }
}
