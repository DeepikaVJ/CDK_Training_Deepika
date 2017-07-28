import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by jhanward on 7/28/2017.
 */
public class EmployeeReader {

    public static void main(String[] args){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream("C:\\Users\\jhanward\\IdeaProjects\\CDK_Training_Deepika\\FileDemo\\EmployeeManagement\\EmployeeData.txt");
            ois = new ObjectInputStream(fis);
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee.getEmployeeId());
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(ois != null){
                    ois.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
