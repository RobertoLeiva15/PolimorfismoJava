package Polimorfismo;

public class MainEjercicio5 {

	public static void main(String[] args) {

        // ===============================
        // EJERCICIO 5
        // ===============================

        // Como use herencia:
        // Cree la clase Transporte y luego Avion hereda de Transporte

        // Metodos que cambie:
        // Sobrescribi el metodo moverse() en Avion

        // Pruebas que hice:
        // Use una variable tipo Transporte pero con un objeto Avion
		
		Transporte t = new Avion();
		t.moverse();
	}
}