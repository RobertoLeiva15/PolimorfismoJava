package Polimorfismo;

public class MainEjercicio7 {

	public static void main(String[] args) {
		// ===============================
        // EJERCICIO 7
        // ===============================

        // Como use herencia:
        // Cree la clase Vehiculo y luego Motocicleta hereda de Vehiculo

        // Metodos que cambie:
        // Sobrescribi el metodo encender() en Motocicleta

        // Pruebas que hice:
        // Use una variable tipo Vehiculo pero con un objeto Motocicleta

        Vehiculo v = new Motocicleta();

        v.encender();
	}
}