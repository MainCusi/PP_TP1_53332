public class App {// Clase principal con el metodo main para ejecutar el programa
    public static void main(String[] args) {
        // Crear un evento con datos específicos
        EventoUniversitario evento1 = new EventoUniversitario("E001", "Charla de POO", 2000, false);
        // Crear otro evento, en este caso gratuito
        EventoUniversitario evento2 = new EventoUniversitario("E002", "Hackathon Java", 0, true);

        // Crear una copia del primer evento usando el constructor de copia
        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
        // Crear una copia del segundo evento
        EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);

        // Mostrar los datos de los eventos originales
        System.out.println("Eventos originales:");
        evento1.mostrarDatos(); // muestra datos del evento1
        evento2.mostrarDatos(); // muestra datos del evento2

        // Mostrar los datos de las copias
        System.out.println("Copias de eventos:");
        copiaEvento1.mostrarDatos(); // muestra datos de la copia del evento1
        copiaEvento2.mostrarDatos(); // muestra datos de la copia del evento2

        // Mostrar la cantidad total de eventos creados (incluye originales y copias)
        System.out.println("Cantidad total de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}
