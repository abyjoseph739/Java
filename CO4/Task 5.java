class Worker implements Runnable {

    private String taskName;
    private int loopCount;

    Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }

    public void run() {

        for (int i = 1; i <= loopCount; i++) {

            System.out.println(taskName + " - step " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
                break;
            }
        }
    }
}

public class Task5 {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Downloading", 5);
        Worker worker2 = new Worker("Processing", 3);
        Worker worker3 = new Worker("Uploading", 4);

        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);
        Thread t3 = new Thread(worker3);

        t1.start();
        t2.start();
        t3.start();
    }
}