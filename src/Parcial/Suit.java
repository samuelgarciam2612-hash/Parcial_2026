package Parcial;

public class Suit extends Habitaciones{
    private double recargoAdicional;

    public Suit(String nombre, double tarifaBase, int cantidadNoches, double recargoAdicional) {
        super(nombre, tarifaBase, cantidadNoches);
        this.recargoAdicional = recargoAdicional;
    }


    @Override
    public double calcularTotal() {
        double subTotal = getTarifaBase() * getCantidadNoches();
        double valorRecargo = subTotal * (recargoAdicional / 100.0);
        return subTotal + valorRecargo;
    }
}

