package Threads.SleepAndStop;

public class Main {
    public static void main(String[] args) {
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        Thread simpleThread1 = new Thread(simpleRunnable);
        simpleThread1.start();
        ThreadSleeper.sleep(10000);
        simpleRunnable.stop();
    }
}
