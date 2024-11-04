package patronesDedisenio;

public class App3 {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Gustavo Gamero");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
