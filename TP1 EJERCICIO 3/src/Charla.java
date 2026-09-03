// Subclase Charla
public class Charla extends Actividad {
    private String disertante; // opcional: nombre del disertante

    // Constructor
    public Charla(int id, String titulo, int cupoMaximo) {
        super(id, titulo, cupoMaximo);
    }

    // Las charlas son gratuitas
    @Override
    public double calcularCostoMateriales() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Charla";
    }
}
