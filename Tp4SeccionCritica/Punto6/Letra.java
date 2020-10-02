package Punto6;

public class Letra implements Runnable {

    private int cantidad;
    private String letra;
    private Turno turno;

    public Letra(String l, int c, Turno t) {
        this.letra = l;
        this.cantidad = c;
        this.turno = t;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public void run() {
        boolean autoParado = false;
        while (!autoParado) {
            try {
                turno.Preguntar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < cantidad; i++) {
                System.out.print(letra);
            }
            turno.Avanzar();
        }
    }
}
