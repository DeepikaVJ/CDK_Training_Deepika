import java.util.Comparator;

/**
 * Created by jhanward on 7/27/2017.
 */
public class SalaryComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        return e1.getSalary() - e2.getSalary();
    }
}
