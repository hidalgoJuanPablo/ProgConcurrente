package Punto14;

public class Empleado implements Runnable {

    private Confiteria confiteria;
    public int accion;

    public Empleado(Confiteria confiteria, int accion) { // accion 1= beber, 2 comer, 3 comer y beber
        this.confiteria = confiteria;
        this.accion = accion;
    }

    @Override
    public void run() {
        boolean yacomio = false;
        while (!yacomio) {
            if (confiteria.VerificarLugar()) {
                switch (accion) {
                    case 1:
                        SolicitarBebida();
                        bebiendo();
                        break;
                    case 2:
                        SolicitarComida();
                        comiendo();
                        break;
                    case 3:
                        SolicitarBebida();
                        bebiendo();
                        SolicitarComida();
                        comiendo();
                        break;
                }
                confiteria.LiberarLugar();
                yacomio = true;
            }
        }
    }

    public void SolicitarBebida() {
        confiteria.SolicitarMozo();
    }

    private void bebiendo() {
        /* Metodo que simula al empleado bebiendo */
        try {
            System.out.println(Thread.currentThread().getName() + " esta bebiendo");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " termino de beber");
        } catch (InterruptedException ex) {
            System.out.println("Hubo un error");
        }
    }

    public void SolicitarComida() {
        confiteria.SolicitarCocinero();
    }

    private void comiendo() {
        /* Metodo que simula al empleado comiendo */
        try {
            System.out.println(Thread.currentThread().getName() + " esta comiendo");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " termino de comer");
        } catch (InterruptedException ex) {
            System.out.println("Hubo un error");
        }
    }
}
