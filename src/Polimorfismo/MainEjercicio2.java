package Polimorfismo;

public class MainEjercicio2 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 2
        // ===============================

        // Como use herencia:
        // Cree la clase Figura y luego Rectangulo hereda de Figura

        // Metodos que cambie:
        // Sobrescribi el metodo area() en Rectangulo

        // Pruebas que hice:
        // Use una variable tipo Figura pero con un objeto Rectangulo

        Figura f = new Rectangulo(8, 5);

        System.out.println("Area: " + f.area());
    }
}