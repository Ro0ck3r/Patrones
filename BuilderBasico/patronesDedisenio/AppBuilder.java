package patronesDedisenio;

public class AppBuilder {
	    public static void main(String[] args) {
	        // Crear un objeto Coche utilizando el Builder
	        Coche coche = new Coche.CocheBuilder()
	                .color("Rojo")
	                .modelo("Deportivo")
	                .motor("V8")
	                .ruedas("De aleación")
	                .build();

	        System.out.println(coche); // Imprime los detalles del coche
	    }
	}