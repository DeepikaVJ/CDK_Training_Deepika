import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by jhanward on 7/27/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee employeeOne = new Employee(11, "Ram", 400000);
        employeeList.add(employeeOne);
        Employee employeeTwo = new Employee(12, "Sham", 800000);
        employeeList.add(employeeTwo);
        Employee employeeThree = new Employee(13, "Mahesh", 3000000);
        employeeList.add(employeeThree);
        Employee employeeFour = new Employee(14, "Manoj", 670000);
        employeeList.add(employeeFour);
        Employee employeeFive = new Employee(15, "Gauri", 25000);
        employeeList.add(employeeFive);

        ArrayList<Employee> newList = new ArrayList<>();
                newList = employeeListOfHigherSalary(employeeList);

        SortById(newList);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("C:/Users/jhanward/IdeaProjects/CDK_Training_Deepika/FileDemo/EmployeeManagement/EmployeeData.txt");
            oos = new ObjectOutputStream(fos);
            Iterator<Employee> iterator = newList.iterator();
            while (iterator.hasNext()) {
                Employee tmp = iterator.next();
                oos.writeObject(tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SortById(ArrayList<Employee> employeeList) {
        Iterator itr = employeeList.iterator();
        Employee employee = null;
        IdComparator id = new IdComparator();
        Collections.sort(employeeList, id);
        System.out.println(employeeList.toString());
    }

    private static ArrayList<Employee> employeeListOfHigherSalary(ArrayList<Employee> employeeList) {
        ArrayList<Employee> newList = new ArrayList<>();
        Iterator<Employee> itr = employeeList.iterator();
        SalaryComparator sc = new SalaryComparator();
        Collections.sort(employeeList, sc);
//
     for (Employee e : employeeList) {
            if (e.getSalary() > 40000) {
                newList.add(e);
            }
        }
        return newList;
    }
}