package Polimorfismo;

public class Estudiante extends Persona{ //hereda de Persona
	String carrera;
	String carnet;
	
	public Estudiante(String carnet, String carrera) {
		this.carnet = carnet;
		this.carrera = carrera;
	}

	@Override
	public void presentarse() {
		System.out.println("Soy estudiante, Carnet: " + carnet + " Carrera: "+ carrera);
	}
}