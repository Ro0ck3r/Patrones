package patronesDedisenio;

public class App2 {

	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor1.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor1.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("www.campusvirtual.unah.edu");
	}

}
