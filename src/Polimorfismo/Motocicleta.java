package Polimorfismo;

public class Motocicleta extends Vehiculo {//hereda de Vehiculo

	@Override
	public void encender() {
		System.out.println("La motocicleta enciende con un boton");
	}
}
