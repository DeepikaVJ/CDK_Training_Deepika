/**
 * Created by jhanward on 7/22/2017.
 */
public class NewClass {
    public static void main(String[] args) {
        String name = new String("cdk");
        String name1 = name.intern();
        String name2 = "cdk";
        System.out.println(name.equals(name1));
        System.out.println(name1.equals(name2));
        System.out.println(name.equals(name2));
        System.out.println(name == name1);
        System.out.println(name1 == name2);
        System.out.println(name2 == name);

        String s = null;
        s.compareTo("abc");
    }
}