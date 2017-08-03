/**
 * Created by jhanward on 7/31/2017.
 */
public class WorkerOne extends Thread {

    ValueTask valueTask = new ValueTask();

    public WorkerOne(ValueTask valueTask) {
        this.valueTask = valueTask;
    }

    public void run() {

        while (true) {
            try {
                valueTask.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
