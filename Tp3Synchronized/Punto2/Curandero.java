package Punto2;

public class Curandero extends Personaje implements Runnable {

    public Curandero(Vida unVida) {
        super(unVida);
    }
	
    public void run(){
        try{
            vid.operar(3);
        }catch(InterruptedException e){
            System.out.println("Hubo un error");
        }
    }    
}
