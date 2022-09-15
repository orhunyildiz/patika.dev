package Threads.CriticalSectionsAndRaceConditionAndThreadPooling;

import Threads.SleepAndStop.ThreadSleeper;

public class QMatic implements Runnable {
    private int orderNo;
    private final Object LOCK = new Object();

    public QMatic() {
        orderNo = 0;
    }

    @Override
    public void run() {
        ThreadSleeper.sleep(50);
        synchronized (LOCK) {
            orderNo = orderNo + 1;
            String builder = Thread.currentThread().getName() +
                    " thread got " +
                    orderNo +
                    " from QMatic!";
            System.out.println(builder);
        }
    }

    public int getOrderNo() {
        return orderNo;
    }
}
