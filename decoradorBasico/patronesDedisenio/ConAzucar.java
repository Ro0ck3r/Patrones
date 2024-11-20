package patronesDedisenio;

public class ConAzucar extends BebidaDecorador {
	public ConAzucar (Bebida bebida) {
		super(bebida);
	}
	//Agregando el costo de agregar azucar
	@Override
	public double obtenerCosto() {
		return bebida.obtenerCosto() + 0.50;
	}
	//Sobreescribiendo el metodo obtenerDescripcion
	@Override
	public String obtenerDescripcion() {
		return bebida.obtenerDescripcion()+ ", con Azucar";
	}
}
