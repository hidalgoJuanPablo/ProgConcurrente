package Punto12;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ElemJaula {
    private String objeto;
    private ReentrantLock lock;

    public ElemJaula(String unObjeto) {
        this.objeto = unObjeto;
        lock = new ReentrantLock();
    }

    public boolean preguntarParaUsar() {
        /*
         * Simula el paso por de un hamster por el elemento de la jaula si este esta
         * disponible
         */
        boolean loUso = false;
        if (lock.tryLock()) { // Pregunta si esta disponible el objeto
            try {
                System.out.println("EL HAMSTER: " + Thread.currentThread().getName() + " ESTA USANDO: " + this.objeto);
                Thread.sleep(5000);
                loUso = true; // Como lo uso, devuelve true
            } catch (InterruptedException ex) {
                Logger.getLogger(ElemJaula.class.getName());
            }
            System.out.println("HAMSTER: " + Thread.currentThread().getName() + " TERMINO DE USAR: " + this.objeto);
            lock.unlock();
        }
        return loUso;
    }
}
