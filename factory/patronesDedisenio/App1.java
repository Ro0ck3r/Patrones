package patronesDedisenio;

public class App1 {
	public static void main(String[] args) {
		ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
		
		System.out.println("El objeto ORACLE tiene las siguientes propiedades "+cx1);
		System.out.println("El objeto MySQL tiene las siguientes propiedades "+cx2);
		System.out.println("El objeto DESCONOCIDO tiene las siguientes propiedades "+cx3);
	}
}
