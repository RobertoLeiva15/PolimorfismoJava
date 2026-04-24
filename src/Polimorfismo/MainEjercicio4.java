package Polimorfismo;

public class MainEjercicio4 {

	public static void main(String[] args) {
        // ===============================
        // EJERCICIO 4
        // ===============================

        // Como use herencia:
        // Cree la clase Cuenta y luego CuentaAhorro hereda de Cuenta

        // Metodos que cambie:
        // Sobrescribi el metodo depositar() en CuentaAhorro

        // Pruebas que hice:
        // Use una variable tipo Cuenta pero con un objeto CuentaAhorro
		
		Cuenta c = new CuentaAhorro(100);
		c.depositar(50);
		System.out.println("Saldo final: " +c.saldo);
	}
}