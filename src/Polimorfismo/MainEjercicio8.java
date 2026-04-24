package Polimorfismo;

public class MainEjercicio8 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 8
        // ===============================

        // Como use herencia:
        // Cree la clase Producto y luego ProductoDigital hereda de Producto

        // Metodos que cambie:
        // Sobrescribi el metodo mostrarDescripcion() en ProductoDigital

        // Pruebas que hice:
        // Use una variable tipo Producto pero con un objeto ProductoDigital

        Producto p = new ProductoDigital("Curso Java", 250, "Online");

        p.mostrarDescripcion();
    }
}