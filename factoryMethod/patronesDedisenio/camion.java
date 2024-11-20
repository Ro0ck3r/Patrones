package patronesDedisenio;

public class camion implements transporte{
	/*Atributos*/
	private String nombre;
	private int numeroRuedas;
	private int capacidad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}	
	
	public camion () {
		this.nombre = nombre;
		this.numeroRuedas = numeroRuedas;
		this.capacidad = capacidad;
	}
	


	public void delivery(){
		System.out.print("Se ha realizado la entrega por camion\n");
		
	}

}
