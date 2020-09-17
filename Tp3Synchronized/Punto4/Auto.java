package Punto4;

public class Auto extends Vehiculo implements Runnable {
    private int kmParaReserva;
    private int kmRecorridos;
    private Estacion estacion;

    public Auto(String unPatente,int kmParaReserva,Estacion unaEstacion ) {
        super(unPatente);
        this.kmParaReserva = kmParaReserva;
        this.kmRecorridos=0; //Son los kmRecorridos desde que se cargo el tanque
        this.estacion=unaEstacion;
    }
    
    public void run(){
        boolean autoParado=false;
        while(!autoParado){
            if(kmRecorridos==kmParaReserva){
                estacion.cargarNafta(this);
            }else{
                System.out.println(this.getPatente()+" km: "+this.kmRecorridos);
                kmRecorridos++;
                try{
                    Thread.sleep(800);//Lleva spleep para simular la subida de km
                }catch(InterruptedException ex){
                    System.out.println("Hubo error");
                }
            }                   
        }
    }
    
    public void setKmRecorridos(int unKmRecorridos){
        this.kmRecorridos = unKmRecorridos;
    }
}
