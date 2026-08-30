package Two_hundred_programs;

class MyThread2 extends Thread {
    public void run() { System.out.println("Running via Thread subclass"); }
}
public class ThreadUsingExtends {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();
        t.start();
        t.join();
    }
}