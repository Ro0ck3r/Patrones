package patronesDedisenio;

public class ConexionVacia implements IConexion{

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}
	
	@Override
	public String toString() {
		return "Esto es un objeto vacio";
	}

}
