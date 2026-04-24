package Polimorfismo;

public class MainEjercicio10 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 10
        // ===============================

        // Como use herencia:
        // Cree la clase Trabajador y luego TrabajadorPorHora hereda de Trabajador

        // Metodos que cambie:
        // Sobrescribi el metodo calcularPago() en TrabajadorPorHora

        // Pruebas que hice:
        // Use una variable tipo Trabajador pero con un objeto TrabajadorPorHora

        Trabajador t = new TrabajadorPorHora(8, 25);

        System.out.println("Pago total: " + t.calcularPago());
    }
}
