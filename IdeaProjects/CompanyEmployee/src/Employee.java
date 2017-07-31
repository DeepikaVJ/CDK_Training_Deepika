/**
 * Created by jhanward on 7/20/2017.
 */
public class Employee {
    int id;
    String name;
    JoiningMonth joiningMonth;
    JoiningYear joiningYear;

    public Employee(int id, String name, JoiningMonth joiningMonth, JoiningYear joiningYear) {
        this.id = id;
        this.name = name;
        this.joiningMonth = joiningMonth;
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joiningMonth=" + joiningMonth +
                ", joiningYear=" + joiningYear +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JoiningMonth getJoiningMonth() {
        return joiningMonth;
    }

    public void setJoiningMonth(JoiningMonth joiningMonth) {
        this.joiningMonth = joiningMonth;
    }

    public JoiningYear getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(JoiningYear joiningYear) {
        this.joiningYear = joiningYear;
    }
}
