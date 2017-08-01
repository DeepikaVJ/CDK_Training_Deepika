/**
 * Created by jhanward on 7/31/2017.
 */
public class ValueTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Threading.VAL += 1;
        }
    }
}
