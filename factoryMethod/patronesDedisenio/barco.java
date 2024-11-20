package patronesDedisenio;

public class barco implements transporte{
	private String nombre;
	private int numeroMotores;
	private int capacidad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public barco () {
		this.nombre = nombre;
		this.numeroMotores = numeroMotores;
		this.capacidad = capacidad;
	}
	
	public void delivery() {
		System.out.print("Se ha realizado la entrega por barco\n");
	}
}
