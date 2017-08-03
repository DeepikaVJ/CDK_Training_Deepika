import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by jhanward on 7/31/2017.
 */


public class Concurrency implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum += i;
        }
        System.out.println("Sum of 500 numbers i " + sum);
    }
    @Test
    public void testThreadPool(){
        Concurrency computeSumTask = new Concurrency();
        Executor executor = Executors.newCachedThreadPool();
        for(int i = 0; i < 32; i++){
            executor.execute(computeSumTask);
        }
    }
}

