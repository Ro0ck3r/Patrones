package patronesDedisenio;

public class CuentaCorriente implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abri� una cuenta Corriente");
		System.out.println("Cliente: " + c.getCliente());		
	}

}
