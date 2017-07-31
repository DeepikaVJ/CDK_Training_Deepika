/**
 * Created by jhanward on 7/25/2017.
 */
public class EmployeeService {
    int employeeId;
    String name;
    double salary;
    String phone;
    String designation;

    public EmployeeService(int employeeId, String name, double salary, String phone, String designation) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.designation = designation;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }



}
