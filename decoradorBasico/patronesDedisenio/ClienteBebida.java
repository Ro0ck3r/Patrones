package patronesDedisenio;

public class ClienteBebida {

	public static void main(String[] args) {
		Bebida bebida = new BebidaBase();
        System.out.println("Descripci�n: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());
        
        // Agregarle leche a la bebida base
        bebida = new ConLeche(bebida);
        System.out.println("\nDescripci�n: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());
        
        // Agregarle az�car a la bebida con leche
        bebida = new ConAzucar(bebida);
        System.out.println("\nDescripci�n: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());

	}

}
