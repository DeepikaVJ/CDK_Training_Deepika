/**
 * Created by jhanward on 7/28/2017.
 */
public class CollectorDemo {
    public static void main(String[] args) {

        int []arr= {1,2,3,4};
        CollectorService.collect(arr,(int []array) -> {
            System.out.printf("Array Size : %s",array.length);
        });
    }
}
