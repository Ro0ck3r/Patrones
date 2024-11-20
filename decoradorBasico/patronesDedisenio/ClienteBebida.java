package patronesDedisenio;

public class ClienteBebida {

	public static void main(String[] args) {
		Bebida bebida = new BebidaBase();
        System.out.println("Descripción: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());
        
        // Agregarle leche a la bebida base
        bebida = new ConLeche(bebida);
        System.out.println("\nDescripción: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());
        
        // Agregarle azúcar a la bebida con leche
        bebida = new ConAzucar(bebida);
        System.out.println("\nDescripción: " + bebida.obtenerDescripcion());
        System.out.println("Costo: $" + bebida.obtenerCosto());

	}

}
