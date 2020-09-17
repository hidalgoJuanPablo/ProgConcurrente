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
public class Main4 {
    
    public static void main(String[] args) {
        
        Estacion estacion=new Estacion();
        
        Auto a1 = new Auto("Auto 1",10,estacion);
        Auto a2 = new Auto("Auto 2",11,estacion);
        Auto a3 = new Auto("Auto 3",10,estacion);
        Auto a4 = new Auto("Auto 4",14,estacion);
        Auto a5 = new Auto("Auto 5",15,estacion);
        
        Thread auto1=new Thread(a1);
        Thread auto2=new Thread(a2);
        Thread auto3=new Thread(a3);
        Thread auto4=new Thread(a4);
        Thread auto5=new Thread(a5);
        
        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();
        auto5.start();
        
    }
    
}
