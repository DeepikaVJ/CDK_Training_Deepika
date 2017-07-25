package MyPkg;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by jhanward on 7/17/2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        getPrimeNumbers(testNumber);
    }

    private static ArrayList getPrimeNumbers(int testNumber) {
        ArrayList<Integer> PrimeList = new ArrayList<Integer>();
        if (testNumber <= 1) {
            System.out.println("No prime number");
        } else if (testNumber == 2) {
            PrimeList.add(testNumber);
        } else {
            for (int i = 3; i <= testNumber; i += 2) {
                for (int j = 3; j < i; j++) {
                    if (i % j == 0) {
                        continue;
                    } else {
                        j += 2;
                    }
                    if (j == i)
                        PrimeList.add(i);
                }
            }
            System.out.println(PrimeList);
        }
        return PrimeList;
    }
}
