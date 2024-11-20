package patronesDedisenio;

public class BebidaBase  implements Bebida{
	@Override
	public double obtenerCosto() {
		return 5.00;
	}
	
	@Override
	public String obtenerDescripcion() {
		return "Bebida Base";
	}

}
