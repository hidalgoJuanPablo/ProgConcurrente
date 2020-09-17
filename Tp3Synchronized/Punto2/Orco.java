package Punto2;

public class Orco extends Personaje  implements Runnable {

    public Orco(Vida unVida) {
        super(unVida);
    }

    public void run(){
        try{
            vid.operar(-3);
        }catch(InterruptedException e){
            System.out.println("Hubo un error");
        }
    }    
}
