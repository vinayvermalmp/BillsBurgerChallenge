package cuncurrencyDemo;

import static cuncurrencyDemo.ThreadColor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE+"hello! this is my program");

        //-----create thread by using subclass ....
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==== Another Thread =======");
        anotherThread.start();

        // creating anonymous thread
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello! from the anonymous thread ");
            }
        }.start();

        // creating thread by implementing runnable interface ..
        // most developer prefer this method to crate thread because it is more flexible have more method
        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"123Hello from myRunnable's class implantation run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();


        System.out.println(ANSI_PURPLE+"hello! again this is my program");
    }
}
