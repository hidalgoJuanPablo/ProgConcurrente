package Punto14;
public class Cocinero implements Runnable{
    private Confiteria confiteria;

    public Cocinero(Confiteria confiteria) {
        this.confiteria = confiteria;
    }

    @Override
    public void run(){
        while(true){
            try {                
                confiteria.esperarParaServirComida();                
                comidaHaciendose();
                confiteria.llevarLaComida();
            } catch ( Exception ex) {
                
            }
        }
    }
    
    private void comidaHaciendose(){         
        try {
          
            System.out.println("Cocinero le lleva la comida al empleado");
        //    Thread.sleep(2000);
        } catch ( Exception ex) {
            
        }
    }
}

