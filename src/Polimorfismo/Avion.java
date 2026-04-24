package Polimorfismo;

public class Avion extends Transporte { //heredad de transporte

	@Override
	public void moverse() {
		System.out.println("El avion vuela");
	}
}