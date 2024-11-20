package patronesDedisenio;

public class ConLeche extends BebidaDecorador {
	//Creando el constructor
	public ConLeche(Bebida bebida) {
        super(bebida);
    }
    @Override
    // Agregar costo de la leche
    public double obtenerCosto() {
        return bebida.obtenerCosto() + 1.50;  
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con leche";
    }
}
