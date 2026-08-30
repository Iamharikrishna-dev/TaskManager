package Two_hundred_programs;

public class ThreadUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("Running via Runnable");
        Thread t = new Thread(task);
        t.start();
        t.join();
    }
}