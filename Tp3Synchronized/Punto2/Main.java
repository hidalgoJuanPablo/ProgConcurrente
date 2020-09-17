package Punto2;

public class Main {
    public static void Main(String[] args) {
        Vida vid=new Vida();
        Orco or=new Orco(vid);
        Curandero curan=new Curandero(vid);
        Thread Orco=new Thread(or);
        Thread Curandero=new Thread(curan);
        Orco.start();
        Curandero.start();
    }
}
