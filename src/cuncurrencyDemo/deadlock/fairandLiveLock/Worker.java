package cuncurrencyDemo.deadlock.fairandLiveLock;

public class Worker {
    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void work(SharedResources sharedResources, Worker otherWorker){
        while (active){
            if (sharedResources.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {

                }
                continue;
            }
            if (otherWorker.isActive()){
                System.out.println(getName() + " : give resources to the worker " + otherWorker.getName());
                sharedResources.setOwner(otherWorker);
                continue;
            }
            System.out.println(getName()+ " worker on the common resources");
            active = false;
            sharedResources.setOwner(otherWorker);
        }
    }
}
