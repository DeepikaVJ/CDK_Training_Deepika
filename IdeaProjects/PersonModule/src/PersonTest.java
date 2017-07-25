import java.util.HashMap;

/**
 * Created by jhanward on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");
        Person p3 = new Person("Ramesh", "M");
        Person p4 = new Person("Suresh", "M");
        Person p5 = new Person("Suresh", "M");
        Person p6 = new Person("Ramesh", "M");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.getName().hashCode());
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));
        for (int i = 0; i < 200; i++) {
            System.out.println( " "+ (Integer.valueOf(i) == Integer.valueOf(i)) + " "+ i);
        }
        }

}