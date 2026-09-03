package Parcial;

public class EnOferta  extends Habitaciones{
    private double porcentajeDescuento;

    public EnOferta(String nombre, double tarifaBase, int cantidadNoches, double porcentajeDescuento) {
        super(nombre, tarifaBase, cantidadNoches);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularTotal() {
        double subtotal = getTarifaBase() * getCantidadNoches();
        double valorDescuento = subtotal * (porcentajeDescuento / 100.0);
        return subtotal - valorDescuento;
    }
}
