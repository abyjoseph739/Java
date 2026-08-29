class CountdownThread extends Thread {

    CountdownThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(getName() + " - Countdown: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args) {

        CountdownThread t1 = new CountdownThread("Thread 1");
        CountdownThread t2 = new CountdownThread("Thread 2");

        t1.start();
        t2.start();
    }
}