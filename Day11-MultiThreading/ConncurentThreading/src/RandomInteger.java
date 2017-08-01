import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by jhanward on 8/1/2017.
 */

public class RandomInteger implements Runnable{
    Thread threadOne = null;
    Thread threadTwo = null;
    LinkedBlockingQueue<Double> randomList = null;

    public static void main(String[] args) throws Exception {
        new RandomInteger();
        System.out.println("Finish");
    }

    public RandomInteger() throws Exception {
        threadOne = new Thread(this);
        threadTwo = new Thread(this);
        randomList = new LinkedBlockingQueue<>();
        threadOne.start();
        threadTwo.start();
    }

    @Override
    public void run() {
        if(Thread.currentThread()  == threadOne){
            for (int i = 0; i < 1000; i++) {
                try {
                    randomList.put(Math.random()*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if(Thread.currentThread()  == threadTwo){
            System.out.println(randomList.toString());
        }
    }
}
