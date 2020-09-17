package Punto3;

public class Main {
    public static void Main(String[] args){
        Turno turno = new Turno();

        Letra letraA = new Letra('A', 1, turno);
        Letra letraB = new Letra('B', 2, turno);
        Letra letraC = new Letra('C', 3, turno);

        Thread hiloA = new Thread(letraA);
        Thread hiloB = new Thread(letraB);
        Thread hiloC = new Thread(letraC);
        
        hiloA.start();
        hiloB.start();
        hiloC.start();
    }
}