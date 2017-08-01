import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by jhanward on 8/1/2017.
 */

/*Write a program using concurrent APIs so that one thread can
   produce some random integer data and other thread can read it
   from the same collection and display it on the console.*/
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
        try {
            System.out.println("abc");
        }
        finally{
            System.out.println("Final");
            System.out.println(randomList.size());
        }
    }

    @Override
    public void run() {
        if(Thread.currentThread()  == threadOne){
            for (int i = 0; i < 100; i++) {
                try {
                    randomList.put(Math.random()*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if(Thread.currentThread()  == threadTwo){
            System.out.println(randomList.size());
            System.out.println(randomList.toString());
        }
    }
}
