package Polimorfismo;

public class Empleado {
	
	String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	//metodo del padre
	public void resumen () {
		System.out.println("Empleado:" + nombre);
	}
}
