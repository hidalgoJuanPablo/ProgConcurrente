package Punto9;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViajeTaxi {
    Semaphore semTaxi;
    Semaphore semTaxista;
    Semaphore semPasajero;

    public ViajeTaxi() {
        semTaxi = new Semaphore(1);
        semTaxista = new Semaphore(0);
        semPasajero = new Semaphore(0); // True --> control Fifo orden de la cola del semaforo
    }

    public void esperaPasajero() throws InterruptedException {
        semTaxista.acquire();// El taxista no tiene permiso en el semaforo,espera
    }

    public void terminoDeLlevar() {
        System.out.println("Taxista llego al destino y le avisa al cliente");
        semPasajero.release();// Le avisa al pasajero que llego
    }

    public void solicitaSerAtendido() throws InterruptedException {
        semTaxi.acquire();
        System.out.println(Thread.currentThread().getName() + " solicita ser atendido al taxista");
        semTaxista.release();
    }

    public void esperaLlegar() throws InterruptedException {
        semPasajero.acquire();// Simula que esta esperando hasta que el taxita le diga que llegaron a su
                              // destino
        System.out.println(Thread.currentThread().getName() + " fue avisado que llego a su destino");
    }

    public void liberarTaxi() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " paga y se baja del taxi");
            semPasajero.release();
            semTaxi.release();// Libera el taxi
        } catch (InterruptedException ex) {
            Logger.getLogger(Pasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
