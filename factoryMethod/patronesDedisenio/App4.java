package patronesDedisenio;

public class App4 {

	public static void main(String[] args) {
		//Creamos por medio de la fabrica el creador de camiones
		Fabrica CreadoraCamiones = new CreadoraCamiones();
		transporte camion = CreadoraCamiones.crearTransporte();
		camion.delivery();
		
		Fabrica CreadoraBarcos = new CreadoraBarcos();
		transporte barco = CreadoraBarcos.crearTransporte();
		barco.delivery();
	}

}
