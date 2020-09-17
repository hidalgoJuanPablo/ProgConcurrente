package Punto3;
public class Turno {
    private int actual = 1;

    public Turno(){
    }
	
    public void Avanzar(){
        actual = actual + 1;  
        if (actual >3)
            actual = 1;    
    }
	
    public   int getTurno(){
        return actual;
    }    
}