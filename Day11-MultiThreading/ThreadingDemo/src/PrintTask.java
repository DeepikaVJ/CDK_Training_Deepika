import org.junit.Test;

/**
 * Created by jhanward on 7/31/2017.
 */

class PrintTask implements Runnable {

    @Test
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Threading.VAL);
        }
    }
}