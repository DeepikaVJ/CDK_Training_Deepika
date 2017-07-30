import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jhanward on 7/27/2017.
 */
public class CarDataSet {
    public static void main(String[] args) {
        HashSet<String> car = new HashSet<String>();
        car.add("Hyundai");
        car.add("Audi");
        car.add("BMW");
        car.add("Toyota");
        car.add("Lamborghini");
        car.add("Indigo");
        car.add("Indica");
        car.add("Maruti");
        car.add("Desire");

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            File file = new File("C:\\Users\\jhanward\\IdeaProjects\\CDK_Training_Deepika\\FileDemo\\src\\Cars.txt");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Iterator<String> iterator = car.iterator();
            String tmp = null;
            while (iterator.hasNext()) {
                tmp = iterator.next();
                bufferedWriter.write(tmp);
                bufferedWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if(fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

