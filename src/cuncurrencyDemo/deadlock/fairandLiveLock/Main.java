package cuncurrencyDemo.deadlock.fairandLiveLock;

public class Main {
    public static void main(String[] args) {
        final Worker worker1 = new Worker("worker 1", true);
        final Worker worker2 = new Worker("worker 2", true);

        final SharedResources sharedResources = new SharedResources(worker1);
        //final SharedResources sharedResources2 = new SharedResources(worker2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(sharedResources, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(sharedResources, worker1);
            }
        }).start();

    }
}
