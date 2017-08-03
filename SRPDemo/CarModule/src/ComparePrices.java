import java.util.Comparator;

/**
 * Created by jhanward on 7/26/2017.
 */
public class ComparePrices implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        if(c1.getPrice() > c2.getPrice()) {
            return 1;
        } else if(c1.getPrice() < c2.getPrice()) {
            return -1;
        }
        return 0;
    }
}
