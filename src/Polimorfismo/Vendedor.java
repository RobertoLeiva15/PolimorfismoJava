package Polimorfismo;

public class Vendedor extends Empleado {
	double comision;

	public Vendedor(String nombre, double comision) {
		super(nombre);
		this.comision = comision;
	}

	@Override
	public void resumen() {
		System.out.println("Vendedor: " + nombre + " - Comision: " + comision);
	}
}
