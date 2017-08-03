import org.junit.Test;

/**
 * Created by jhanward on 7/31/2017.
 */
public class Threading {


    static int VAL;
    @Test
    public void execute() {
            Thread threadOne = new Thread(new ValueTask());
            Thread threadTwo = new Thread(new PrintTask());
            threadOne.start();
            threadTwo.start();
        }
}


