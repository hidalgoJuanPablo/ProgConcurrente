package Punto8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Semaphore;

public class Testigo {
    private Semaphore semTestigo;

    public Testigo() {
        semTestigo = new Semaphore(1);
    }

    public void tomarTestigo() throws InterruptedException {
        semTestigo.acquire();
        Date date = new Date();
        SimpleDateFormat x = new SimpleDateFormat(" hh:mm:ss");// Le da el formato que queremos
        System.out.println(Thread.currentThread().getName() + " agarro el testigo a las: " + x.format(date));
        System.out.println(Thread.currentThread().getName() + " corre");
    }

    public void soltarTestigo() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " solto el testigo");
        semTestigo.release();
    }
}
