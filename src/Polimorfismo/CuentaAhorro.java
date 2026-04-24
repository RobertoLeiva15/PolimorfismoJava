package Polimorfismo;

public class CuentaAhorro extends Cuenta {//hereda de Cuenta

	public CuentaAhorro(double saldo) {
		super(saldo);
	}

	@Override
	public void depositar(double monto) {
		double interes = monto * 0.05;
		saldo+=monto + interes;
	}
}