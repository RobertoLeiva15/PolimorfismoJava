package Polimorfismo;

public class MainEjercicio6 {

	public static void main(String[] args) {
        // ===============================
        // EJERCICIO 6
        // ===============================

        // Como use herencia:
        // Cree la clase Persona y luego Estudiante hereda de Persona

        // Metodos que cambie:
        // Sobrescribi el metodo presentarse() en Estudiante

        // Pruebas que hice:
        // Use una variable tipo Persona pero con un objeto Estudiante
		
		Persona p = new Estudiante ("0905-25-11678", "Ingenieria en Sistemas");
		p.presentarse();
	}
}