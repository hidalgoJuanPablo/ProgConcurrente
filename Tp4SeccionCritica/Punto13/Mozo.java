package Punto13;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mozo implements Runnable {
    private Confiteria confiteria;

    public Mozo(Confiteria confi) {
        confiteria = confi;
    }

    public void run() {
        while (true) {
            try {
                confiteria.esperarParaServir();//
                comidaHaciendose();
                confiteria.llevarLaComida();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void comidaHaciendose() {
        // Metodo que simula como el mozo espera para que el cocinero termine de cocinar
        try {
            System.out.println("MOZO esperando a que el cocinero haga la comida para el empleado");
            Thread.sleep(5000);
            System.out.println("Cocinero termino de cocinar la comida");
            System.out.println("MOZO le lleva la comida al empleado");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
