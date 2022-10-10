package lab_9_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee person1 = new FTE();
        Employee person2 = new FTE();
        Employee person3 = new FTE();
        Employee person4 = new Contractor();
        Employee person5 = new Contractor();
        employees.add(person1);
        employees.add(person2);
        employees.add(person3);
        employees.add(person4);
        employees.add(person5);
        System.out.println("Total salary of company: " + Calculator.CalculateSalary(employees));
    }
}
