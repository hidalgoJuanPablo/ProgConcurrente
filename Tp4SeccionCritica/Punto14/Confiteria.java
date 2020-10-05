package Punto14;

public class Confiteria {
    private int lugar;

    public Confiteria() {
        lugar = 2;
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

    public void SolicitarComida() {
        System.out.println(Thread.currentThread().getName() + "Pidio comida");
    }

    public void SolicitarBebida() {
        System.out.println(Thread.currentThread().getName() + "Pidio bebida");
    }
}
