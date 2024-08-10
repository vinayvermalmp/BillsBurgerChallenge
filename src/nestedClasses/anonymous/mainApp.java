package nestedClasses.anonymous;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mainApp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan", "Vana", "20/01/2010");
        Employee e2 = new Employee("Mohan", "Rana", "20/01/2000");
        Employee e3 = new Employee("Sohan", "nana", "20/01/2005");
        Employee e4 = new Employee("Taran", "tomar", "20/01/2020");
        List<Employee> list = new ArrayList<Employee>(Arrays.asList(e1, e2, e3, e4));

        printOrderedList(list, "name");
        System.out.println("......................");
        printOrderedList(list, "year");
    }

    public static void printOrderedList(List<Employee> elist, String sortField){

        int currentYear = LocalDate.now().getYear();
        class MyEmployee{
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                this.yearsWorked= currentYear-Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                this.fullName = String.join(" ", containedEmployee.first(), containedEmployee.last());
            }

            @Override
            public String toString(){
                return "%s has been an employee for %d years ".formatted(fullName, yearsWorked);
            }
        }
        List<MyEmployee> list = new ArrayList<>();
        for(Employee employee: elist){
           list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField == "name") {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);
        for (MyEmployee myEmployee :
                list) {
            System.out.println(myEmployee);

        }
    }
}

