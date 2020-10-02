package Punto9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Taxista implements Runnable {
    private ViajeTaxi viaje;

    public Taxista(ViajeTaxi viaje) {
        this.viaje = viaje;
    }
    
    public void run(){
        boolean termino=false;
        while(!termino){
            try{
                viaje.esperaPasajero();
                llevaPasajero();
                viaje.terminoDeLlevar();
            }catch(InterruptedException ex){
                Logger.getLogger(Taxista.class.getName()).
                log(Level.SEVERE, null, ex);                
            }
        }
    }
    
    public void llevaPasajero(){
        try{
            System.out.println("El taxista lleva a pasajero al destino");
            Thread.sleep(7000);//Sleep para simular el viaje;
        }catch(InterruptedException ex){
            Logger.getLogger(Taxista.class.getName()).
                log(Level.SEVERE, null, ex);                
        }
    }    
}
