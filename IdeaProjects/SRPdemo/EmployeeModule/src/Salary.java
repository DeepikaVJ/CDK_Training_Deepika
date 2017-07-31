import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jhanward on 7/25/2017.
 */
public class Salary {
    public static void main(String[] args) {
        ArrayList<Double> salaryList = new ArrayList<>(10);

        salaryList.add(100000.00);
        salaryList.add(20000.00);
        salaryList.add(55000.00);
        salaryList.add(890000.00);
        salaryList.add(80000.00);
        salaryList.add(10000.00);
        salaryList.add(5000000.00);
        salaryList.add(18000.00);
        salaryList.add(78000.00);
        salaryList.add(345000.00);
        salaryList.add(17000.00);
        getHRA(salaryList);
        increaseSalary(salaryList);

    }
    public static void getHRA(ArrayList<Double> salaryList) {
        Iterator itr = salaryList.iterator();
        double salary;
        while(itr.hasNext()) {
            salary = (double)itr.next();
            System.out.println("Salary : " + salary + "  HRA : " + 0.3*salary);
        }
    }
    public static void increaseSalary(ArrayList<Double> salaryList) {
        Iterator itr = salaryList.iterator();
        double salary;
        double newSalary;
        int counter = 0;
        while(itr.hasNext()) {
            salary = (double)itr.next();
            if(salary < 20000) {
                newSalary = salary + 0.2 * salary;
                System.out.println("Updated Salary : " + newSalary);
                salaryList.set(counter, newSalary);
            }
            counter++;
        }
    }
}