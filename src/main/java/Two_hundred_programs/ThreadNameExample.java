package Two_hundred_programs;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Running in: " + Thread.currentThread().getName()));
        t.setName("WorkerThread");
        t.start();
    }
}