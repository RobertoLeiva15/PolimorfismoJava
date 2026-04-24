package Polimorfismo;

public class Guitarra extends Instrumento { //hereda de Instrumento

	@Override
	public void tocar() {
		System.out.println("La guitara suena");
	}
}