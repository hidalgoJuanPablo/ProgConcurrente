package Punto14;

public class Main {
    
    public static void main(String[] args) {
        Confiteria confiteria;
        confiteria = new Confiteria();
       /*  Empleado[] empleados;
       empleados(4); 
        for (int i =0 ; i<6;i++){
            empleados.a Empleado(confiteria, 2); 
        }*/

        Empleado empleado1 = new Empleado(confiteria, 2);
        Empleado empleado2 = new Empleado(confiteria, 1);
        Empleado empleado3 = new Empleado(confiteria, 3);

        Thread th1 = new Thread(empleado1,"Juan");
        Thread th2 = new Thread(empleado2,"Fran");
        Thread th3 = new Thread(empleado3,"El Nuevo");
        
        th1.start();
        th2.start();
        th3.start();
    }
}

