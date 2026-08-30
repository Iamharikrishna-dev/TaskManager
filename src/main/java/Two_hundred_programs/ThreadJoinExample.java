package Two_hundred_programs;

public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Child thread finished"));
        t.start();
        t.join();
        System.out.println("Main thread finished after child");
    }
}