package patronesDedisenio;

public class App6 {
    public static void main(String[] args) {
        // Usamos la fábrica para crear diferentes tipos de vehículos
        Vehiculo coche = VehiculoFactory.crearVehiculo("coche");
        Vehiculo moto = VehiculoFactory.crearVehiculo("moto");
        Vehiculo camion = VehiculoFactory.crearVehiculo("camion");

        // Conducimos los vehículos
        coche.conducir();
        moto.conducir();
        camion.conducir();
    }
}