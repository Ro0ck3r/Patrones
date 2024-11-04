package patronesDedisenio;

public class FabricaProductor1 {

	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica1();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}

		return null;
	}

}