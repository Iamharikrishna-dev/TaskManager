package Two_hundred_programs;

class Counter3 {
    private int count = 0;
    synchronized void increment() { count++; }
    int getCount() { return count; }
}
public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException {
        Counter3 c = new Counter3();
        Runnable task = () -> { for (int i = 0; i < 1000; i++) c.increment(); };
        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count: " + c.getCount());
    }
}