package Punto13;

public class MainConfiteria {

    public static void main(String[] args) {

        Confiteria confiteria = new Confiteria();

        Mozo unMozo = new Mozo(confiteria);

        EmpleadoConfiteria unEmpleado1 = new EmpleadoConfiteria(confiteria);
        EmpleadoConfiteria unEmpleado2 = new EmpleadoConfiteria(confiteria);

        Thread mozo = new Thread(unMozo);
        Thread empleado1 = new Thread(unEmpleado1, "EMPLEADO1");
        Thread empleado2 = new Thread(unEmpleado2, "EMPLEADO2");

        mozo.start();
        empleado1.start();
        empleado2.start();
    }
}
