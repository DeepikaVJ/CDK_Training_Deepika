/**
 * Created by jhanward on 7/25/2017.
 */
public class Manager {
    public static double updateSalary(double salary) {
        return salary;
    }

    public static boolean eligibleForPromotion(String designation){
        if(designation.equals("Software Developer")) {
            return true;
        }
        return false;
    }
    public static void changeProject() {
        System.out.println("Project changed");

    }
    public static String changeDesignation(String designation){
        if(eligibleForPromotion(designation)) {
            return "Senior Software Developer";
        }

        return designation;
    }
}


