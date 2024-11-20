package patronesDedisenio;

public class App6 {
    public static void main(String[] args) {
        // Usamos la f�brica para crear diferentes tipos de veh�culos
        Vehiculo coche = VehiculoFactory.crearVehiculo("coche");
        Vehiculo moto = VehiculoFactory.crearVehiculo("moto");
        Vehiculo camion = VehiculoFactory.crearVehiculo("camion");

        // Conducimos los veh�culos
        coche.conducir();
        moto.conducir();
        camion.conducir();
    }
}