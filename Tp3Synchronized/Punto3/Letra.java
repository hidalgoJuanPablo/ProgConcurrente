package Punto3;
public class Letra implements Runnable {
    private Turno turno;
    private int turnoLetra;
    private char letra;
    
    public Letra( char letra, int turnoLetra, Turno turno ){
        this.turno = turno;
        this.turnoLetra = turnoLetra;
        this.letra = letra;
    }  
     
    public void run() {
        boolean autoParado=false;
        while(!autoParado){
            synchronized(turno){
				int turnoActual = turno.getTurno();
				if (turnoActual == turnoLetra){
					for (int i = 1; i <= turnoLetra; i++) {          
						System.out.print(letra);            
					}
					turno.Avanzar();
				}
            }
        }
    }
}