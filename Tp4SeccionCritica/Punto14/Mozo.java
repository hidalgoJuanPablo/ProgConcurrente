package Punto14;

public class Mozo implements Runnable {
    private Confiteria confiteria;

    public Mozo(Confiteria confiteria) {
        this.confiteria = confiteria;
    }

    @Override
    public void run(){
        while(true){
            try {                
                confiteria.esperarParaServirBebida();                
                comidaHaciendose();
                confiteria.llevarLaBebida();
            } catch ( Exception ex) {
                
            }
        }
    }
    
    private void comidaHaciendose(){
        //Metodo que simula como el mozo espera para que el cocinero termine de cocinar
        try {
          
            System.out.println("MOZO le lleva la bebida al empleado");
        //    Thread.sleep(2000);
        } catch ( Exception ex) {
            
        }
    }
}
