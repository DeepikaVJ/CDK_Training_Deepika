import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jhanward on 7/22/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        EmployeeCompare compare1 = new EmployeeCompare();
        arrayList = createData();
        Collections.sort(arrayList, compare1);
        for (Employee e : arrayList) {
            System.out.println(e.toString());
        }
    }

    public static ArrayList<Employee> createData() {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        Employee e1 = new Employee("Ramesh","Jain",11,"HR",Location.Pune);
        Employee e2 = new Employee("Ramesh","Malhotra",12,"HR",Location.Pune);
        Employee e3 = new Employee("Seema","Patil",13,"Finance",Location.Pune);
        Employee e4 = new Employee("Mahesh","Jain",14,"HR",Location.Pune);
        Employee e5 = new Employee("Ramesh","Patil",15,"R&D",Location.Pune);
        Employee e6 = new Employee("Ramesh","Jain",16,"HR",Location.Pune);
        Employee e7 = new Employee("Ramesh","Malhotra",17,"R&D",Location.Pune);
        Employee e8 = new Employee("Seema","Patil",18,"Finance",Location.Pune);
        Employee e9 = new Employee("Meena","Patil",19,"R&D",Location.Pune);
        Employee e10 = new Employee("Ramesh","Jain",20,"R&D",Location.Pune);
        Employee e11 = new Employee("Ramesh","Jain",21,"HR",Location.Pune);
        Employee e12 = new Employee("Ramesh","Malhotra",22,"HR",Location.Pune);
        Employee e13 = new Employee("Seema","Patil",23,"Finance",Location.Pune);
        Employee e14 = new Employee("Mahesh","Jain",24,"HR",Location.Pune);
        Employee e15 = new Employee("Ramesh","Patil",25,"R&D",Location.Pune);
        Employee e16 = new Employee("Ramesh","Jain",26,"HR",Location.Pune);
        Employee e17 = new Employee("Ramesh","Malhotra",27,"R&D",Location.Pune);
        Employee e18 = new Employee("Seema","Patil",28,"Finance",Location.Pune);
        Employee e19 = new Employee("Meena","Patil",29,"R&D",Location.Pune);
        Employee e20 = new Employee("Ramesh","Jain",30,"R&D",Location.Pune);
        Employee e21 = new Employee("Ramesh","Jain",11,"HR",Location.Pune);
        Employee e22 = new Employee("Ramesh","Malhotra",12,"HR",Location.Pune);
        Employee e23 = new Employee("Seema","Patil",13,"Finance",Location.Pune);
        Employee e24 = new Employee("Mahesh","Jain",14,"HR",Location.Pune);
        Employee e25 = new Employee("Ramesh","Patil",15,"R&D",Location.Pune);
        Employee e26 = new Employee("Rama","Jain",16,"HR",Location.Pune);
        Employee e27 = new Employee("Ramesh","Malhotra",17,"R&D",Location.Pune);
        Employee e28 = new Employee("Seema","Patil",18,"Finance",Location.Pune);
        Employee e29 = new Employee("Meena","Patil",19,"R&D",Location.Pune);
        Employee e30 = new Employee("Ramesh","Jain",20,"R&D",Location.Pune);
        Employee e31 = new Employee("Ramesh","Jain",21,"HR",Location.Pune);
        Employee e32 = new Employee("Ramesh","Malhotra",22,"HR",Location.Pune);
        Employee e33 = new Employee("Seema","Patil",23,"Finance",Location.Pune);
        Employee e34 = new Employee("Mahesh","Jain",24,"HR",Location.Pune);
        Employee e35 = new Employee("Rames","Patil",25,"R&D",Location.Pune);
        Employee e36 = new Employee("Ramesh","Jain",26,"HR",Location.Pune);
        Employee e37 = new Employee("Ramesh","Malhotra",27,"R&D",Location.Pune);
        Employee e38 = new Employee("Seema","Patil",28,"Finance",Location.Pune);
        Employee e39 = new Employee("Meena","Patil",29,"R&D",Location.Pune);
        Employee e40 = new Employee("Ram","Jain",30,"R&D",Location.Pune);

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e6);
        arrayList.add(e7);
        arrayList.add(e8);
        arrayList.add(e9);
        arrayList.add(e10);
        arrayList.add(e11);
        arrayList.add(e12);
        arrayList.add(e13);
        arrayList.add(e14);
        arrayList.add(e15);
        arrayList.add(e16);
        arrayList.add(e17);
        arrayList.add(e18);
        arrayList.add(e19);
        arrayList.add(e20);
        arrayList.add(e21);
        arrayList.add(e22);
        arrayList.add(e23);
        arrayList.add(e24);
        arrayList.add(e25);
        arrayList.add(e26);
        arrayList.add(e27);
        arrayList.add(e28);
        arrayList.add(e29);
        arrayList.add(e30);
        arrayList.add(e31);
        arrayList.add(e32);
        arrayList.add(e33);
        arrayList.add(e34);
        arrayList.add(e35);
        arrayList.add(e36);
        arrayList.add(e37);
        arrayList.add(e38);
        arrayList.add(e39);
        arrayList.add(e40);
        return arrayList;
    }

}