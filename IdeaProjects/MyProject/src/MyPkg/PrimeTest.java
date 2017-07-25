package MyPkg;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Arrays;

import static java.util.Arrays.asList;

/**
 * Created by jhanward on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void PrimeNumber2() {
        List<Integer> newList = Arrays.asList(2);
        Assert.assertEquals("Number is even", newList, PrimeNew.getPrimeNumbers(2));
    }
}
