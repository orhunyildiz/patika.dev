package Threads.ImplementMethod;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("My summation " + threadName + " is started!");
        int total = 0;
        for (int i = 0; i < 1000; i++)
            total += i;
        System.out.println("Total: " + total);
    }
}
