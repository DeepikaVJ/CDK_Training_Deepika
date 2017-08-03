import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jhanward on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> newList = new ArrayList<Employee>();
        newList = createTestData();
        for (Employee e: newList) {
            System.out.println(e.toString());
        }
    }

    private static ArrayList<Employee> createTestData() {
        ArrayList<Employee> employeeList= new ArrayList<Employee>();
        Employee employeeOne = new Employee(11, "Ram", new Date(1995-1900,11+1,1), new Date(2017-1900,7+1,17),5, Location.Hyderabad);
        employeeList.add(employeeOne);
        Employee employeeTwo = new Employee(12, "Sham", new Date(1994-1900,1+1,14), new Date(2016-1900,6+1,13),4, Location.Pune);
        employeeList.add(employeeTwo);
        Employee employeeThree = new Employee(13, "Mahesh", new Date(1993-1900,2+1,14), new Date(2017-1900,5+1,19),5, Location.Hyderabad);
        employeeList.add(employeeThree);
        Employee employeeFour = new Employee(14, "Manoj", new Date(1996-1900,5+1,5), new Date(2016-1900,7+1,7),3, Location.Hyderabad);
        employeeList.add(employeeFour);
        Employee employeeFive = new Employee(15, "Gauri", new Date(1990,7,6), new Date(2016,7,17),5, Location.Pune);
        employeeList.add(employeeFive);
        return employeeList;
    }
}
