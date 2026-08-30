package Two_hundred_programs;

public class RunnableLambdaExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 3; i++) System.out.println("Lambda thread: " + i);
        });
        t.start();
        t.join();
    }
}