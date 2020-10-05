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
                        confiteria.SolicitarBebida();                        
                        break;
                    case 2:
                        confiteria.SolicitarComida();
                        break;
                    case 3:
                        confiteria.SolicitarBebida();
                        confiteria.SolicitarComida();
                        break;
                }
                confiteria.LiberarLugar();
                yacomio = true;
            }
        }
    }
}
