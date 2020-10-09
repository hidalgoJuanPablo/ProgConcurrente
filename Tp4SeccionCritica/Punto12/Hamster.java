package Punto12;

public class Hamster implements Runnable {
    private String name;
    private boolean feliz;
    private Jaula jaula;

    public Hamster(Jaula unJaula) {
        this.jaula = unJaula;
        feliz = false;
    }

    public boolean getFeliz() {
        return feliz;
    }

    public void run() {
        feliz = jaula.hamsterFeliz();
        System.out.println("HAMSTER: " + Thread.currentThread().getName() + " ESTA FELIZ");
    }
}
