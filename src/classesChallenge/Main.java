// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package classesChallenge;

public class Main {
    public static void main(String[] args) {
        Account boobSaccount = new Account();
        boobSaccount.withdrawFunds(100);

        boobSaccount.depositFunds(250);
        boobSaccount.withdrawFunds(50);
        boobSaccount.withdrawFunds(200);
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}