import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by jhanward on 7/27/2017.
 */
public class FileIO {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\jhanward\\IdeaProjects\\CDK_Training_Deepika\\FileDemo\\src\\Movies.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.print((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
