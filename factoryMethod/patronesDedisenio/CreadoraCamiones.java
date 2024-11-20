package patronesDedisenio;

public class CreadoraCamiones extends Fabrica {
	@Override
	public transporte crearTransporte() {
		return new camion();

	}
}
