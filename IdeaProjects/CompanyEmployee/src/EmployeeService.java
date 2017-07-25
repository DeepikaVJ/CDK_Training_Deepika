/**
 * Created by jhanward on 7/20/2017.
 */
public class EmployeeService extends Employee {
    EmployeeService(int id, String name, JoiningMonth joiningMonth, JoiningYear joiningYear) {
        super(id, name, joiningMonth, joiningYear);
    }
    public void createAccount(){
        System.out.println("Account Created");
    }

}
