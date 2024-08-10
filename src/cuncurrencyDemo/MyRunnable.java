package cuncurrencyDemo;

import static cuncurrencyDemo.ThreadColor.ANSI_RED;
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from myRunnable's implantation run()");
    }
}
