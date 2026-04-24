package Polimorfismo;

public class Avion extends Transporte { //hereda de transporte

	@Override
	public void moverse() {
		System.out.println("El avion vuela");
	}
}