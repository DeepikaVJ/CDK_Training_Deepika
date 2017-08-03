import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by jhanward on 7/31/2017.
 */
public class WorkerTwo extends Thread {
    PrintTask printTask = new PrintTask();

    public WorkerTwo(PrintTask printTask) {
        this.printTask = printTask;
    }

    public void run() {
        while (true) {
            try {
                printTask.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}