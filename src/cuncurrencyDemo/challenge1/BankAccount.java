package cuncurrencyDemo.challenge1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String accountNo;
    private double balance;
    private Lock lock;

    public BankAccount(String accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

   /* public synchronized void deposit(double amount){
        balance += amount;
    }

    public synchronized void withDraw(double amount){
        balance -=amount;
    }*/

    public void deposit(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Could not get the lock");
        }
        System.out.println("Transaction status : " +status);
    }

    public void withDraw(double amount){
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Transaction status : " +status);
    }

    public String getAccountNo() {
        return accountNo;
    }
    public void printAccountNo(){
        System.out.println("Account number = " + accountNo);
    }
}
