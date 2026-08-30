package Two_hundred_programs;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread running"));
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority: " + t.getPriority());
        t.start();
    }
}