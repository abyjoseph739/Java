class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread: " + i);
        }
    }
}

public class Task4 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println("Main before run()");
        t1.run();
        System.out.println("Main after run()");

        System.out.println("\n--- Using start() ---");

        MyThread t2 = new MyThread();

        System.out.println("Main before start()");
        t2.start();
        System.out.println("Main after start()");
    }
}