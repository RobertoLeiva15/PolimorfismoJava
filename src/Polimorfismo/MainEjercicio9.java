package Polimorfismo;

public class MainEjercicio9 {

	public static void main(String[] args) {
		// ===============================
        // EJERCICIO 9
        // ===============================

        // Como use herencia:
        // Cree la clase Instrumento y luego Guitarra hereda de Instrumento

        // Metodos que cambie:
        // Sobrescribi el metodo tocar() en Guitarra

        // Pruebas que hice:
        // Use una variable tipo Instrumento pero con un objeto Guitarra
		
		Instrumento i = new Guitarra();
		i.tocar();
	}
}