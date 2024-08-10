package inheritanceChalange;

import inheritanceChalange.Employee;
import inheritanceChalange.HourlyEmployee;
import inheritanceChalange.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
      Employee tim = new Employee("Tim", "11/6/1980", "1/1/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());


        SalariedEmployee joe = new SalariedEmployee("joe", "11/7/1980",  "1/1/2020" , 35000 );
        System.out.println(joe);
        System.out.println(joe.getAge());
        System.out.println("Joe's paycheck $"+joe.collectPay());
        joe.retire();
        System.out.println("Joe pension check $"+joe.collectPay());

      HourlyEmployee mercy = new HourlyEmployee("joe", "11/7/1980",  "1/1/2020" , 15 );
      System.out.println(mercy);
      System.out.println(mercy.getAge());
      System.out.println("Mercy's paycheck $"+mercy.collectPay());
      joe.retire();
      System.out.println("Mercy holiday check $"+mercy.getDoublePay());
    }




}