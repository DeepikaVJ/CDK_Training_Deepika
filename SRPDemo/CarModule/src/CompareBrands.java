import java.util.Comparator;

/**
 * Created by jhanward on 7/26/2017.
 */
public class CompareBrands implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c1.getBrand().compareTo(c2.getBrand());
    }
}
