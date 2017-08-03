/**
 * Created by jhanward on 7/26/2017.
 */
public class CompareIds {
    public int compare(Car c1, Car c2) {
        if(c1.getId() > c2.getId()) {
            return 1;
        } else if(c1.getId() < c2.getId()) {
            return -1;
        }
        return 0;
    }
}
