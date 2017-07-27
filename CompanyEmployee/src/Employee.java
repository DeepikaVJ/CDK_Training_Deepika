import java.util.Date;

/**
 * Created by jhanward on 7/18/2017.
 */
public class Employee {
    int employeeId;
    String name;
    Date dob;
    Date doj;
    int departmentId;
    Location location;
    Object o;

    public Employee(int employeeId, String name, Date dob, Date doj, int departmentId, Location location) {
        this.employeeId = employeeId;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.departmentId = departmentId;
        this.location = location;
    }

    public void SortbyEmployeeId() {
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    class MySalaryComp implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            if (e1.getEmployeeId() < e2.getEmployeeId()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
    }

@Override
public String toString(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MMMM.dd");
        return"Employee{"+
        ", name='"+name+'\''+
        ", dob="+simpleDateFormat.format(dob)+
        "}";
        }

public Employee(int employeeId){
        this.employeeId=employeeId;
        }

public int getEmployeeId(){
        return employeeId;
        }

public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
        }

public Date getDob(){
        return dob;
        }

public void setDob(Date dob){
        this.dob=dob;
        }

public String getName(){
        return name;
        }

public void setName(String name){
        this.name=name;
        }

public Date getDoj(){
        return doj;
        }

public void setDoj(Date doj){
        this.doj=doj;
        }

public int getDepartmentId(){
        return departmentId;
        }

public void setDepartmentId(int departmentId){
        this.departmentId=departmentId;
        }

public Location getLocation(){
        return location;
        }

public void setLocation(Location location){
        this.location=location;
        }

        }
