package Polimorfismo;

public class ProductoDigital extends Producto { // hereda de Producto

    String formato;

    public ProductoDigital(String nombre, double precio, String formato) {
        super(nombre, precio);
        this.formato = formato;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Producto digital: " + nombre + 
                           " Precio: " + precio + 
                           " Formato: " + formato);
    }
}