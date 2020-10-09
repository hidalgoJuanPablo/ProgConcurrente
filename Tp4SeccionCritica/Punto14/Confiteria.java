package Punto14;

import java.util.concurrent.Semaphore;

public class Confiteria {
    private int lugar;
    private Semaphore semMozo; // hobbi en trabaja
    private Semaphore semMozoLibre; // esta libre para servir bebida

    private Semaphore semCocinero; // hobbi en trabaja
    private Semaphore semCocineroLibre; // esta libre para servir comida

    private Semaphore semEmpleado;

    public Confiteria() {
        lugar = 2;
        semMozo = new Semaphore(0);
        semMozoLibre = new Semaphore(1);

        semCocinero = new Semaphore(0);
        semCocineroLibre = new Semaphore(1);

        semEmpleado = new Semaphore(1);
    }

    public synchronized boolean VerificarLugar() {
        if (lugar > 0) {
            lugar--;
            return true;
        }
        return false;
    }

    public synchronized void LiberarLugar() {
        lugar++;
    }

    /* Mozo */
    public void SolicitarMozo() {
        try {
            semMozoLibre.acquire();
            System.out.println(Thread.currentThread().getName() + " le pide al mozo que lo atienda");
            semMozo.release();
            semEmpleado.acquire();
        } catch (Exception e) {

        }
    }

    public void esperarParaServirBebida() {
        try {
            System.out.println("Mozo haciendo su hobbie mientras espera que le avisen para atender");
            semMozo.acquire();
        } catch (Exception e) {
        }
    }

    public void llevarLaBebida() {
        System.out.println("Mozo lleva la bebida");
        System.out.println("Mozo ya llevo la bebida y se desocupa");
        semEmpleado.release();
        semMozoLibre.release();
    }

    /* Cocinero */
    public void SolicitarCocinero() {
        try {
            semCocineroLibre.acquire();
            System.out.println(Thread.currentThread().getName() + " le pide al cocinero que lo atienda");
            semCocinero.release();
            semEmpleado.acquire();
        } catch (Exception e) {

        }
    }

    public void esperarParaServirComida() {
        try {
            System.out.println("Cocinero haciendo su hobbie mientras espera que le avisen para atender");
            semCocinero.acquire();
        } catch (Exception e) {
        }
    }

    public void llevarLaComida() {
        System.out.println("Cocinero lleva la comida");
        System.out.println("Cocinero ya llevo la comida y se desocupa");
        semEmpleado.release();
        semCocineroLibre.release();
    }

}
