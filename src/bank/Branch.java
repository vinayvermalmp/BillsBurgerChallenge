package bank;

import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    private Customer findCustomer(String customerName){
        if (!customers.isEmpty()){
            for (Customer customer: this.customers) {
                if (customer.getName().equals(customerName)){
                    return customer;
                }
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double transaction){
        if(findCustomer(customerName) == null){
            Customer customer = new Customer(customerName, transaction);
            this.customers.add(customer);
            return true;
        }else{
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }else{
            return false;
        }
    }
}
