// Subclase Taller
public class Taller extends Actividad {
    private boolean requiereNotebook; // indica si requiere notebook

    // Constructor
    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNotebook) {
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    // Los talleres tienen costo según notebook
    @Override
    public double calcularCostoMateriales() {
        return requiereNotebook ? 5000 : 2000;
    }

    @Override
    public String getTipo() {
        return "Taller";
    }
}
