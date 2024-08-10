package classesChallenge;
public class Account {

    private String accountNumber;

    private double balance;

    private String customerName;

    private String email;

    private String phoneNumber;


    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of Rs."+depositAmount+". New balance "+balance);
       // setAccountBalance(balance);
    }

    public void withdrawFunds(double withdrawAmount){
        if (balance - withdrawAmount < 0 ){
            System.out.println("Insufficient Funds! you only have Rs."+balance+" in your account");
        } else {
            balance -=withdrawAmount;
            System.out.println("withdrawal of Rs." +withdrawAmount+ " processed , remaining balance in account "+withdrawAmount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
