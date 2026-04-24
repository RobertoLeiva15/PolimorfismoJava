package Polimorfismo;

public class MainEjercicio3 {

	public static void main(String[] args) {
		 // ===============================
        // EJERCICIO 3
        // ===============================

        // Como use herencia:
        // Cree la clase Empleado y luego Vendedor hereda de Empleado

        // Metodos que cambie:
        // Sobrescribi el metodo resumen() en Vendedor

        // Pruebas que hice:
        // Use una variable tipo Empleado pero con un objeto Vendedor
		
		Empleado e = new Vendedor ("Roberto", 800);
		e.resumen();
	}
}