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
		System.out.println("Proxy: Realizando alguna operaci�n adicional antes de la operaci�n real.");
        // Delegar la operaci�n al servicio real
		ServicioReal.realizarOperacion();
        // L�gica adicional despu�s de la operaci�n real
        System.out.println("Proxy: Realizando alguna operaci�n adicional despu�s de la operaci�n real.");
	}

}
