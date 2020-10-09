package Punto14;

public class Main {

    public static void main(String[] args) {
        Confiteria confiteria;
        confiteria = new Confiteria();

        int cantEmpleados = 6;

        Mozo mozo = new Mozo(confiteria);
        Thread thMz = new Thread(mozo);

        Cocinero cocinero = new Cocinero(confiteria);
        Thread thCn = new Thread(cocinero);

        Empleado[] empleados = new Empleado[cantEmpleados];
        for (int i = 0; i < cantEmpleados; i++) {
            empleados[i] = new Empleado(confiteria, (i % 3) + 1);

        }
        /*
         * i0 1 b i1 2 c i2 3 c b i3 1 b i4 2 c i5 3 c b
         * 
         */
        Thread[] hilos = new Thread[cantEmpleados];
        for (int i = 0; i < cantEmpleados; i++) {
            hilos[i] = new Thread(empleados[i], "Empleado " + i);
        }

        for (int i = 0; i < cantEmpleados; i++) {
            hilos[i].start();
            ;
        }

        thMz.start();
        thCn.start();
    }
}
