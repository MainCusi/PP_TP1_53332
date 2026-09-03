public class EventoUniversitario {// Clase que modela un Evento Universitario
        // Atributo final: no puede cambiarse una vez asignado
        private final String id;
        // Título del evento
        private String titulo;
        // Costo base del evento
        private double costoBase;
        // Indica si el evento es gratuito
        private boolean gratuito;
        // Contador estático de eventos creados (compartido por todos los objetos)
        private static int cantidadEventos = 0;

        // Constructor principal: inicializa un evento con sus datos
        public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
            this.id = id; // asigna el id recibido
            this.titulo = titulo; // asigna el título recibido
            this.costoBase = costoBase; // asigna el costo base recibido
            this.gratuito = gratuito; // asigna si es gratuito o no
            cantidadEventos++; // incrementa el contador de eventos
        }

        // Constructor de copia: crea un nuevo evento copiando otro existente
        public EventoUniversitario(EventoUniversitario otro) {
            this.id = otro.id; // copia el id del otro evento
            this.titulo = otro.titulo; // copia el título
            this.costoBase = otro.costoBase; // copia el costo base
            this.gratuito = otro.gratuito; // copia si es gratuito
        }

        // Metodo que calcula el costo estimado del evento
        public double calcularCostoEstimado() {
            // Si es gratuito devuelve 0, si no devuelve el costo base
            return gratuito ? 0 : costoBase;
        }

        // Metodo que muestra los datos del evento por consola
        public void mostrarDatos() {
            System.out.println("ID: " + id); // imprime el id
            System.out.println("Título: " + titulo); // imprime el título
            System.out.println("Costo base: $" + costoBase); // imprime el costo base
            System.out.println("Gratuito: " + (gratuito ? "Sí" : "No")); // imprime si es gratuito
            System.out.println("Costo estimado: $" + calcularCostoEstimado()); // imprime el costo estimado
            System.out.println("-----------------------------"); // separador visual
        }

        // Metodo estático que devuelve la cantidad total de eventos creados
        public static int getCantidadEventos() {
            return cantidadEventos; // retorna el contador
        }
    }
