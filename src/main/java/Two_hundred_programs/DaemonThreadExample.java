package Two_hundred_programs;

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Daemon thread running"));
        t.setDaemon(true);
        t.start();
        t.join();
        System.out.println("Main thread done");
    }
}