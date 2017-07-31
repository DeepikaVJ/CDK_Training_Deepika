/**
 * Created by jhanward on 7/22/2017.
 */
public class Employee {
    String firstName;
    String lastName;
    int employeeId;
    String department;
    Location location;

    public Employee(String firstName, String lastName, int employeeId, String department, Location location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
               firstName + '\'' + " " +
               lastName + '\'' + " " +
                employeeId + '\'' + " " +
                 department + '\'' + " " +
                 location + " " +
                '}';
    }
}
