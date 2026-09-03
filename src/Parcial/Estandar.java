package Parcial;

public class Estandar  extends Habitaciones{
    public Estandar(String nombre, double tarifaBase, int cantidadNoches) {
        super(nombre, tarifaBase, cantidadNoches);
    }

    @Override
    public double calcularTotal() {
        return tarifaBase;
    }
}
