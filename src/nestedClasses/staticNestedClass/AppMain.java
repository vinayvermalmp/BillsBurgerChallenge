package nestedClasses.staticNestedClass;

import nestedClasses.innerClass.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(101, "Anil kumar", 1995),
                new Employee(112, "Ramesh kumar", 1985),
                new Employee(103, "Viral kumar", 1997),
                new Employee(144, "Umesh kumar", 2005)
        ));


//        var empCop = new EmployeeComparator<>();
//        employees.sort(empCop);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        for (Employee emp: employees) {
            System.out.println(emp.toString());
        }

        System.out.println("-----------store member inner class example----------------");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
               new StoreEmployee(1023, "Vineeta Sahu", 2019, "Target"),
                new StoreEmployee(1223, "Ram Singh", 2009, "Jio"),
                new StoreEmployee(1043, "Karan Singh", 2012, "Vodafone"),
                new StoreEmployee(1353, "Raja Ram", 2022, "Airtel"),
                new StoreEmployee(1223, "RamCharan Singh", 2010, "Jio"),
                new StoreEmployee(1043, "Kiran Meheta", 2005, "Vodafone")
        ));

        var comparator = new StoreEmployee().new StoreComparator<StoreEmployee>();
        storeEmployees.sort(comparator);

        for (StoreEmployee emp: storeEmployees) {
            System.out.println(emp.toString());
        }
    }

    public static void addPigLatinName(List<? extends StoreEmployee> list) {
          /*
        -> The question mark (?) is known as the wildcard in generic programming. It represents an unknown type.
         The wildcard can be used in a variety of situations such as
         the type of a parameter, field, or local variable; sometimes as a return type.

        1. Upper Bounded Wildcards:
        These wildcards can be used when you want to relax the restrictions on a variable.
        For example, say you want to write a method that works
        on List < Integer >, List < Double >, and List < Number >, you can do this using an upper bounded wildcard.

        To declare an upper-bounded wildcard, use the wildcard character (‘?’), followed by
        the extends keyword, followed by its upper bound.
        public static void add(List<? extends Number> list)

        2. Lower Bounded Wildcards:
        It is expressed using the wildcard character (‘?’), followed by the super keyword,
        followed by its lower bound: <? super A>.

            Syntax: Collectiontype <? super A>

           */


        String lastName = "Piggy";

        class DecoratedEmployee extends StoreEmployee
                implements Comparable<DecoratedEmployee> {

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        newList.sort(null);
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " "
                    + dEmployee.pigLatinName);
        }
    }
}
