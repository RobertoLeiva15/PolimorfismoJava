package Polimorfismo;

public class Cuenta {
	double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	//metodo del padre
	public void depositar(double monto) {
		saldo+=monto;
	}
}