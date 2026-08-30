package Two_hundred_programs;

public class StringBufferThreadSafeDemo {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 1000; i++) sb.append("x"); };
        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final length (thread-safe): " + sb.length());
    }
}
