package lab_9_1;

import java.util.List;

public class Calculator {
    public static int CalculateSalary(List<Employee> employee){
        int totalSalary = 0;
        for (int i = 0; i < employee.size(); i++) {
                totalSalary = totalSalary + employee.get(i).getSalary();
        }
        return totalSalary;
    }
}
