package Polimorfismo;

public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // metodo del padre
    public void mostrarDescripcion() {
        System.out.println("Producto: " + nombre + " Precio: " + precio);
    }
}