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
            semMozo.release();
            semEmpleado.acquire();
        } catch (Exception e) {

        }
    }

    public void esperarParaServirBebida() {
       try {
        semMozo.acquire();
       } catch (Exception e) {  
       }
    }

    public void llevarLaBebida() {
        semEmpleado.release();
        semMozoLibre.release();
    }

    /* Cocinero */
    public void SolicitarCocinero() {
        try {
           semCocineroLibre.acquire();
           semCocinero.release();
           semEmpleado.acquire();
        } catch (Exception e) {

        }
    }

    public void esperarParaServirComida() {
        try {
         semCocinero.acquire();
        } catch (Exception e) {  
        }
     }
 
     public void llevarLaComida() {
         semEmpleado.release();
         semCocineroLibre.release();
     }

}
