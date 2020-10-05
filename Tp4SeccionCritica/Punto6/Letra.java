package Punto6;

public class Letra implements Runnable {

    private int cantidad;
    private String letra;
    private Turno turno;

<<<<<<< Updated upstream
    public Letra(String l, int c, Turno t) {
        this.letra = l;
        this.cantidad = c;
=======
    public Letra( String l, int c, Turno t) {
        this.letra = l;
        this.cantidad = c;        
>>>>>>> Stashed changes
        this.turno = t;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public void run() {
        boolean autoParado = false;
        while (!autoParado) {
            try {
                turno.Preguntar();
<<<<<<< Updated upstream
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < cantidad; i++) {
                System.out.print(letra);
            }
=======
            } catch (InterruptedException e) {                 
                e.printStackTrace();
            }
             for (int i = 0; i < cantidad; i++) {          
                    System.out.print(letra);            
             }
>>>>>>> Stashed changes
            turno.Avanzar();
        }
    }
}
