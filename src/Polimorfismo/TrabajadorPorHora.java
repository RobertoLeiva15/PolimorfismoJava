package Polimorfismo;

public class TrabajadorPorHora extends Trabajador { // hereda de Trabajador

    int horas;
    double pagoPorHora;

    public TrabajadorPorHora(int horas, double pagoPorHora) {
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horas * pagoPorHora;
    }
}