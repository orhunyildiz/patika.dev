package Threads.SleepAndStop;

public class SimpleRunnable implements Runnable {
    private boolean live = true;
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("My summation: " + threadName + " is started!");
        int total = 0;
        while (live) {
            total += 1;
            ThreadSleeper.sleep(500);
        }
        System.out.println("Total: " + total);
    }
    public void stop() {
        live = false;
    }
}
