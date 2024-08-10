package cuncurrencyDemo.challenge1;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456", 1000.00);

        // Create and start the thread here
       /* Thread thread1 = new Thread(){
            public void run(){
                account.deposit(300.00);
                account.withDraw(50.00);
            }
        };

        Thread thread2 = new Thread(){
            public void run(){
                account.deposit(203.75);
                account.withDraw(100.00);
            }
        };
*/
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withDraw(50.00);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withDraw(100.00);
            }
        });


        thread1.start();
        thread2.start();

    }
}
