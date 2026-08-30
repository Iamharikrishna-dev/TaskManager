package Two_hundred_programs;

public class MultipleThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            Thread t = new Thread(() -> System.out.println("Thread " + id + " running"));
            t.start();
            t.join();
        }
    }
}