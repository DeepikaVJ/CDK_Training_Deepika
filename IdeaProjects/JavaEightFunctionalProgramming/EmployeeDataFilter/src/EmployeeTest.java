import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.compare;

/**
 * Created by jhanward on 7/29/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee employeeOne = new Employee(11, "Ram", 700000);
        employeeList.add(employeeOne);
        Employee employeeTwo = new Employee(12, "Sita", 80000);
        employeeList.add(employeeTwo);
        Employee employeeThree = new Employee(13, "Mohan", 25000);
        employeeList.add(employeeThree);
        Employee employeeFour = new Employee(14, "Ramsey", 3000);
        employeeList.add(employeeFour);
        Employee employeeFive = new Employee(15, "Ramesh", 40000);
        employeeList.add(employeeFive);
        Employee employeeSix = new Employee(16, "Akshay", 90000);
        employeeList.add(employeeSix);
        Employee employeeSeven = new Employee(17, "Priya", 713300);
        employeeList.add(employeeSeven);
        Employee employeeEight = new Employee(18, "Pranali", 23400);
        employeeList.add(employeeEight);
        Employee employeeNine = new Employee(19, "Riya", 700000);
        employeeList.add(employeeNine);
        Employee employeeTen = new Employee(20, "Sakshi", 1360000);
        employeeList.add(employeeTen);

        Double totalTds = employeeList.stream().
                filter(employee -> employee.getSalary() > 50000).
                map(employee -> employee.getSalary() * 0.1).
                reduce((acc, val) -> acc + val).get();

        System.out.println("TotalTds :" + totalTds);

        int averageSalary = employeeList.stream().
                map(employee -> employee.getSalary()).
                reduce((acc, val) -> acc + val).get() / employeeList.size();

        System.out.println("Average Salary :" + averageSalary);

        String minSalaryEmployee = employeeList.stream().
                min((Employee e1, Employee e2) -> compare(e1.getSalary(), e2.getSalary())).
                get().
                getName();

        System.out.println("Employee with Salary :" + minSalaryEmployee);

        String maxSalaryEmployee = employeeList.stream().
                max((Employee e1, Employee e2) -> compare(e1.getSalary(), e2.getSalary())).
                get().
                getName();

        System.out.println("Employee with Salary :" + maxSalaryEmployee);

        long employeeCount = employeeList.stream().count();
        System.out.printf("Employee count : %s ", employeeCount);

    }
}
