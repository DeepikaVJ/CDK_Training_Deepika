import java.io.Serializable;

/**
 * Created by jhanward on 7/27/2017.
 */
public class Employee implements Serializable{
    int employeeId;
    transient String name;
    int salary;

    public Employee(int employeeId, String name, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


  /*  Write a program which will hold 10-50 employees in an array list.
        Application will first find those employees who are getting salary
        more then 40000 per month and then will sort them.
        And application will save sorted ones in a file before quiting
        with full details except their salaries and the will retrieve
        them and display the details on console in sorted way only
        based on natural sorting decided by eid field. */


