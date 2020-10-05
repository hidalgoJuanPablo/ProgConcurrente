package Punto6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

<<<<<<< Updated upstream
public class Turno {

    private Map<String, Semaphore> mutexL; // Diccionario de semaforos
    private Map<String, Integer> letras; // Diccionario de letras y posicion
    private String[] letraL; // lista de letras

    public Turno(String[] l) {
        mutexL = new HashMap<String, Semaphore>(); // manejo los bloqueos
        letraL = l; // Este arreglo me sirve para saber cual es el siguiente
        letras = new HashMap<String, Integer>(); // nos permite ubicar la letra en el arreglo
        for (int i = 0; i < l.length; i++) { // Armamos los diccionarios
            mutexL.put(l[i], new Semaphore(0));
            letras.put(l[i], i);
        }
        mutexL.get(l[0]).release(); // Iniciamos el primer hilo
    }

    public void Preguntar() throws InterruptedException {
        mutexL.get(Thread.currentThread().getName()).acquire();
    }

    public void Avanzar() {
        int ind = (letras.get(Thread.currentThread().getName()) + 1) % letraL.length; // buscamos el indice de la
                                                                                      // proxima letra
        mutexL.get(letraL[ind]).release();
    }
=======
public class Turno {         
   
    private  Map<String, Semaphore> mutexL; //Diccionario de semaforos
    private  Map<String, Integer> letras; //Diccionario de letras y posicion
    private  String[] letraL; //lista de letras

    public Turno (String[] l){          
        mutexL =  new HashMap<String, Semaphore>(); // manejo los bloqueos 
        letraL = l; //Este arreglo me sirve para saber cual es el siguiente
        letras =  new HashMap<String, Integer>(); //nos permite ubicar la letra en el arreglo
        for(int i =0 ; i< l.length ;i++){  //Armamos los diccionarios
            mutexL.put(l[i], new Semaphore(0));
            letras.put(l[i],i);
        }
        mutexL.get(l[0]).release(); //Iniciamos el primer hilo
    }
	public void Preguntar() throws InterruptedException {
        mutexL.get(Thread.currentThread().getName()).acquire();        
	}

	public void Avanzar() {
        int ind = (letras.get(Thread.currentThread().getName()) + 1) % letraL.length ; // buscamos el indice de la proxima letra
        mutexL.get(letraL[ind]).release();
	}

>>>>>>> Stashed changes
}
