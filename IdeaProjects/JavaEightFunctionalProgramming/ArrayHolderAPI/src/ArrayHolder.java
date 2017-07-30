import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by jhanward on 7/28/2017.
 */
public class ArrayHolder {
    Integer []array = new Integer[]{1,2,3,4,5};
    List<Integer> list = Arrays.asList(array);

    ArrayHolder(List<Integer> list) {
        this.list = list;
    }

    public void forEach(Consumer<Integer> consumer) {

    }

}
