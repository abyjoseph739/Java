class TimerTask2 implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Tick");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
                break;
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new TimerTask2());

        thread.start();

        Thread.sleep(700);

        thread.interrupt();
    }
}