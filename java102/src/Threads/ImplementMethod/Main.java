package Threads.ImplementMethod;

public class Main {
    public static void main(String[] args) {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        Thread simpleThread1 = new Thread(simpleRunnable);
        Thread simpleThread2 = new Thread(simpleRunnable);
        Thread simpleThread3 = new Thread(simpleRunnable);
        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();
    }
}
