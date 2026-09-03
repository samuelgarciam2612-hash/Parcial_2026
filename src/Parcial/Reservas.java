package Parcial;

public class Reservas {
    private int idReserva;
    private Habitaciones[] habitaciones;
    private static int contador = 1;
    private int cantidadHabitaciones;

public Reservas(){
    this.idReserva = contador++;
    this. habitaciones = new Habitaciones[5];
    this.cantidadHabitaciones = 0;
    }


public void agregarHabitacion(Habitaciones h)throws Exception {
    if (cantidadHabitaciones >= 5) {
        throw new ReservaLlena("Tu reserva ya tiene 5 habitaciones");
    }
    for (int i = 0; i < cantidadHabitaciones; i++) {
        if (habitaciones[i].equals(h)) {
            throw new HabitacionDuplicada("Este producto ya esta en tu factura");
        }
    }
    habitaciones[cantidadHabitaciones] = h;
    cantidadHabitaciones++;
}
    public double CalcularTotalReserva(){
        double total = 0.0;
        for (int i = 0; i < cantidadHabitaciones; i++){
            total += habitaciones[i].calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String resultado = "Reserva # " + idReserva + " Habitaciones [";
        for (int i = 0; i < cantidadHabitaciones; i++){
            resultado += habitaciones[i].toString();
            if (i < cantidadHabitaciones - 1) {
                resultado += ", ";
            }
        }
        resultado += "] - Total: $" + CalcularTotalReserva();
        return resultado;
    }

}


