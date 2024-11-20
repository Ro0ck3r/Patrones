package patronesDedisenio;

public class CreadoraBarcos extends Fabrica {
	@Override
	public transporte crearTransporte() {
		return new barco ();
	}
		
}
