package patronesDedisenio;

public class Cliente {
    public static void main(String[] args) {
        // Usamos el proxy para acceder al servicio
        Servicio servicio = new ServicioProxy();
        
        // Realizamos una operación a través del proxy
        servicio.realizarOperacion();
    }
}