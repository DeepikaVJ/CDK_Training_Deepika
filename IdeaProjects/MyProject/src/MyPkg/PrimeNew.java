package MyPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jhanward on 7/17/2017.
 */
public class PrimeNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        getPrimeNumbers(testNumber);
        List Prime = PrimeGenerator(testNumber);
    }
    public static ArrayList<Integer> getPrimeNumbers(int testNumber) {
        ArrayList PrimeList = new ArrayList<Integer>();
        int flg = 0;
        for (int i = 2; i <= testNumber; i++) {
            flg = 0;
            for (int j = 2; j < Math.sqrt(testNumber) ; j++) {
                if(i % j == 0) {
                    flg = 1;
                }
            }
            if(flg == 0) {
                PrimeList.add(i);
            }
        }
        System.out.println(PrimeList);
        return PrimeList;
    }
    public static ArrayList<Integer> PrimeGenerator(int testNumber) {
        ArrayList PrimeList = new ArrayList<Integer>();
        int flg = 0;
        if (testNumber <= 1) {
            System.out.println("No prime number");
        }  else {
            for (int i = 2; i <= testNumber; i += 2) {
                flg = 0;
                for (int j = 2; j < Math.sqrt(i); j += 2) {
                    if(i % j == 0) {
                        flg = 1;
                    }
                }
                if(flg == 0) {
                    PrimeList.add(i);
                }
            }
        }
        System.out.println(PrimeList);
        return PrimeList;
    }
}

