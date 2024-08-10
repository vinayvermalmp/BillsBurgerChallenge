package cuncurrencyDemo.deadlock.fairandLiveLock;

public class SharedResources {

    private Worker owner;

    public SharedResources(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
