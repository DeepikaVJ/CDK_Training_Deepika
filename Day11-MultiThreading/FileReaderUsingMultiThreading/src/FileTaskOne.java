import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jhanward on 7/31/2017.
 */
public class FileTaskOne implements Runnable{

    public void run() {
        InputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\jhanward\\IdeaProjects\\CDK_Training_Deepika\\Day11-MultiThreading\\FileReaderUsingMultiThreading\\src\\fileOne.txt");
            int b = fis.read();
            while(b != -1){
                b = fis.read();
                System.out.println((char)b);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
