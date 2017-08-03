import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jhanward on 7/31/2017.
 */
public class FileReader{
    @Test
    public void readFile(){
        FileTaskOne fileTaskOne = new FileTaskOne();
        FileTaskTwo fileTaskTwo = new FileTaskTwo();
        WorkerA threadOne = new WorkerA(fileTaskOne);
        threadOne.start();
        WorkerA threadTwo = new WorkerA(fileTaskTwo);
        threadTwo.start();

    }

}
