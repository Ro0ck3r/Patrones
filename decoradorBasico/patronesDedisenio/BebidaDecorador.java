package patronesDedisenio;

public abstract class BebidaDecorador implements Bebida{
	protected Bebida bebida;
	
	public BebidaDecorador (Bebida bebida) {
		this.bebida = bebida;
	}
	// Delegar la operaci�n a la bebida original
    public double obtenerCosto() {
        return bebida.obtenerCosto();  
    }
    // Delegar la operaci�n a la bebida original
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion();  
    }
}
