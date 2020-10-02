package Punto9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pasajero implements Runnable {

    private ViajeTaxi viaje;

    public Pasajero(ViajeTaxi viaje) {
        this.viaje = viaje;
    }

    public void run() {
        try {
            buscandoTaxi();
            viaje.solicitaSerAtendido();
            viaje.esperaLlegar();
            viaje.liberarTaxi();
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscandoTaxi() {
        try {
            System.out.println(Thread.currentThread().getName() + " esta buscando taxi");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
