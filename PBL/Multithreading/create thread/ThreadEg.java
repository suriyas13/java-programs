
public class ThreadEg implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread is running" + Thread.currentThread().getName() + i);

        }
    }

    public static void main(String[] args) {
        ThreadEg th = new ThreadEg();
        Thread t1 = new Thread(th, "First");
        Thread t2 = new Thread(th, "Second");
        t1.start();

        t2.start();
    }
}
