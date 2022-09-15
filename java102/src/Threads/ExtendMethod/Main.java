package Threads.ExtendMethod;

public class Main {
    public static void main(String[] args) {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();
        simpleThread1.start();
        simpleThread2.start();
    }
}
