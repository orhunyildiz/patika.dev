package Threads.RaceOfThreads;

import java.util.ArrayList;

public class ThreadOperation extends Thread {
    private ArrayList<Integer> odd = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> general = new ArrayList<>();

    public ThreadOperation(ArrayList<Integer> general) {
        this.general = general;
    }

    @Override
    public void run() {
        for (Integer integer : general) {
            if (integer % 2 == 0)
                even.add(integer);
            else
                odd.add(integer);
        }
        printOdd();
        printEven();
    }

    public synchronized void printOdd() {
        System.out.println(odd);
    }

    public synchronized void printEven() {
        System.out.println(even);
    }
}
