/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp4;

/**
 *
 * @author repetto.francisco
 */
public class Vida {
    private int vida=10;
    
    public Vida(){ }
    
    public int obtenerVida(){
        return this.vida;
    }
    
    private void volverloAGuardar(int vidaNueva){
        this.vida=vidaNueva;
    }
    
    public synchronized void operar(int num)throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" realiza una operacion sobre la vida sumandole: "
        +num);
        volverloAGuardar(this.vida+num);
        System.out.println("Vida actual: "+this.vida);
    }
}
