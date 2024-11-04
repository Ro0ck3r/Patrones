package patronesDedisenio;

public class ConexionBDFabrica1 implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia1();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL1();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle1();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL1();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer1();
		}

		return new ConexionVacia1();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
