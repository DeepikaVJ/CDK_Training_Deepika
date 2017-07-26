/**
 * Created by jhanward on 7/25/2017.
 */
public class Employee {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService(11, "Ram", 500000, "99955566679", "Software developer");

        employeeService.setSalary(Manager.updateSalary(9000000));
        System.out.println("Salary updated" + employeeService.getSalary());

        employeeService.setDesignation(Manager.changeDesignation(employeeService.getDesignation()));
        System.out.println("Designation updated" + employeeService.getDesignation());

        Manager.changeProject();

        employeeService.setSalary(Finance.calculateTDS(employeeService.getSalary()));
        System.out.println("Salary after TDS" + employeeService.getSalary());

    }
}
