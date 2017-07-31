import java.util.Comparator;

/**
 * Created by jhanward on 7/22/2017.
 */
public class EmployeeCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getLocation().equals(e2.getLocation())) {
            if (e1.getDepartment().equals(e2.getDepartment())) {
                if (e1.getFirstName().equals(e2.getFirstName())) {
                    if (e1.getLastName().equals(e2.getLastName())) {
                        if (e1.getEmployeeId() != e2.getEmployeeId()) {
                            return e1.getEmployeeId() - e2.getEmployeeId();
                        } else {
                            return e1.getLastName().compareTo(e2.getLastName());
                        }
                    }
                    else{
                        return e1.getFirstName().compareTo(e2.getLastName());
                    }
                } else {
                    return e1.getLastName().compareTo(e2.getLastName());
                }
            } else {
                return e1.getDepartment().compareTo(e2.getDepartment());
            }
        } else {
            return e1.getLocation().compareTo(e2.getLocation());
        }
    }
}
