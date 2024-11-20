package patronesDedisenio;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "coche":
                return new Coche();
            case "moto":
                return new Moto();
            case "camion":
                return new Camion();
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido.");
        }
    }
}
