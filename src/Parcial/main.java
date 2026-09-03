package Parcial;

public class main {
    public static void main() throws Exception {
        Reservas r1 = new Reservas();
        try {
            Habitaciones h1 = new Suit("Suite 301", 300_000, 2,20);
            Habitaciones h2 = new EnOferta("Habitacion 208", 100_000, 4, 15);
            Habitaciones h3 = new Estandar("Habitacion 105", 150_000, 3);
            Habitaciones h4 = new Suit("Suit 402", 280_000,1,20);
            Habitaciones h5 = new EnOferta("Habitacion 110", 90_000,2, 0);
            r1.agregarHabitacion(h1);
            r1.agregarHabitacion(h2);
            r1.agregarHabitacion(h3);
            r1.agregarHabitacion(h4);
            r1.agregarHabitacion(h5);

        } catch (ReservaLlena | HabitacionDuplicada e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            // Por si ocurre cualquier otro error inesperado
            System.out.println("Error inesperado: " + e.getMessage());
        }
        System.out.println(r1);

        //Habitaciones h6 = new Estandar("Habitacion 108", 150_000, -2);
        //Habitaciones h7 = new Suit("Suit 409", -50_000, 3,15);

        Reservas r2 = new Reservas();
        try{
            Habitaciones h8 = new Estandar("Habitacion 203", 120_000, 1);
            Habitaciones h9 = new Estandar("Habitacion 106", 100_000, 1);
            Habitaciones h10 = new Suit("Suite 200", 250_000,1, 15);
            Habitaciones h11 = new Suit("Suite 501", 300_000,1,15);
            Habitaciones h12 = new EnOferta("Habitacion 407", 90_000,1,20);
            r2.agregarHabitacion(h8);
            r2.agregarHabitacion(h9);
            r2.agregarHabitacion(h10);
            r2.agregarHabitacion(h11);
            r2.agregarHabitacion(h12);
        }catch (ReservaLlena | HabitacionDuplicada e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            // Por si ocurre cualquier otro error inesperado
            System.out.println("Error inesperado: " + e.getMessage());
        }
        System.out.println(r2);

        Reservas R3 = new Reservas();
        try{
            Habitaciones h13 = new Suit("Suite 510",300_000,2,20);
            Habitaciones h14 = new Suit("Suite 510",300_000,2,20);
            R3.agregarHabitacion(h13);
            R3.agregarHabitacion(h14);
        }catch (ReservaLlena | HabitacionDuplicada e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            // Por si ocurre cualquier otro error inesperado
            System.out.println("Error inesperado: " + e.getMessage());
        }
        System.out.println(R3);

    }


}
