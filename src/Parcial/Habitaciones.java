package Parcial;

import java.util.Objects;

public abstract class Habitaciones {
    protected String nombre;
    protected double tarifaBase;
    protected int cantidadNoches;


    public Habitaciones(String nombre, double tarifaBase, int cantidadNoches) {
        if (tarifaBase < 0 || cantidadNoches <= 0) {
            throw new ArgumentoIlegal("Argumento ilegal ingresado");
        }
        this.nombre = nombre;
        this.tarifaBase = tarifaBase;
        this.cantidadNoches = cantidadNoches;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habitaciones that = (Habitaciones) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public abstract double calcularTotal();

    @Override
    public String toString() {
        return "Habitaciones " +
                "nombre = '" + nombre + ", tarifaBase = " + tarifaBase + ", cantidadNoches = " + cantidadNoches;
    }
}

