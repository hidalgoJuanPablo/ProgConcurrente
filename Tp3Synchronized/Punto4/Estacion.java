package Punto4;

public class Estacion {
    public Estacion(){
       
    }
    public synchronized void cargarNafta(Auto unAuto){
        unAuto.setKmRecorridos(0);
        System.out.println("ESTA CARGANDO NAFTA: "+unAuto.getPatente());
        try{
                Thread.sleep(2000);
            }catch(InterruptedException ex){
                System.out.println("Hubo error");
        }
    }    
}
