package cuncurrencyDemo.deadlock;


import cuncurrencyDemo.ThreadColor;
import streamDemo.Seat;

import java.util.concurrent.locks.ReentrantLock;

// Thread  Starvation example
public class Starvation {
    // private static Object lock = new Object();
    private static ReentrantLock lock = new ReentrantLock(true); // true means it is fair lock and gurrantee first come first served order only ...

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), "Priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), "Priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), "Priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), "Priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static class Worker implements Runnable{
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
               /* synchronized (lock){
                    System.out.format(threadColor + "%s : runCount %d\n", Thread.currentThread().getName(), runCount++);
                    //execute critical section of code
                }*/
                lock.lock();
                try {
                    System.out.format(threadColor + "%s : runCount %d\n", Thread.currentThread().getName(), runCount++);
                    //execute critical section of code
                } finally {
                    lock.unlock(); // why we use finally ?... no matter what happen we want to make sure that lock is released
                    // at the end
                }
            }

        }
    }
}
