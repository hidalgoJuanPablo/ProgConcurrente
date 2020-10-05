package Punto6;

public class Main {
<<<<<<< Updated upstream
    public static void main(String[] args) {
        String[] letras = { "A", "C", "B", "Z" };
        Turno turno = new Turno(letras);

        Letra[] letraA = new Letra[letras.length];

        for (int i = 0; i < letras.length; i++) {
            letraA[i] = new Letra(letras[i], i + 1, turno);
        }

        Thread[] hiloA = new Thread[letras.length];

        for (int i = 0; i < letras.length; i++) {
            hiloA[i] = new Thread(letraA[i], letras[i]);
        }

        for (int i = 0; i < letras.length; i++) {
            hiloA[i].start();
            ;
        }
    }
}
=======
        public static void main(String[] args){
            String[] letras = { "A","C","B", "Z"};
            Turno turno = new Turno(letras);
           
            Letra[] letraA = new Letra[letras.length];

            for (int i =0 ; i < letras.length;i++){
                letraA[i] = new Letra(letras[i], i + 1, turno);
            }
            
            Thread[] hiloA = new Thread[letras.length];

            for (int i =0 ; i < letras.length;i++){
                hiloA[i] = new Thread(letraA[i],letras[i]);
            }
        
            for (int i =0 ; i < letras.length;i++){
                hiloA[i].start();;
            } 
        }
    }


>>>>>>> Stashed changes
