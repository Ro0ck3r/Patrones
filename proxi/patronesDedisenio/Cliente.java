package patronesDedisenio;

public class Cliente {
    public static void main(String[] args) {
        // Usamos el proxy para acceder al servicio
        Servicio servicio = new ServicioProxy();
        
        // Realizamos una operaci�n a trav�s del proxy
        servicio.realizarOperacion();
    }
}