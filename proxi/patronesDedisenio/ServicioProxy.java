package patronesDedisenio;

public class ServicioProxy implements Servicio {
	private ServicioReal ServicioReal;
	
	@Override
	public void realizarOperacion() {
		// Logica adiciona antes de delegar al servicio real
		System.out.print("Se esta verificando la informacion por favor espera.....\n");
		//En casi que no exista una instancia de servicio real, creamo una
		if(ServicioReal==null) {
			ServicioReal = new ServicioReal();
		}
		System.out.println("Proxy: Realizando alguna operación adicional antes de la operación real.");
        // Delegar la operación al servicio real
		ServicioReal.realizarOperacion();
        // Lógica adicional después de la operación real
        System.out.println("Proxy: Realizando alguna operación adicional después de la operación real.");
	}

}
