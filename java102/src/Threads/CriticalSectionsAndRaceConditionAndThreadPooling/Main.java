package Threads.CriticalSectionsAndRaceConditionAndThreadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QMatic qMatic = new QMatic();

        ExecutorService pool = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 100; i++) {
            pool.execute(qMatic);
        }

        System.out.println(qMatic.getOrderNo());

        pool.shutdown();
    }
}
