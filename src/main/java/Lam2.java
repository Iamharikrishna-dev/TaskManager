
public final class Lam2 {

    public static void main(String[] args) {
        demo1();
    }
    private static void demo1() {
        System.out.println(" Runnable ");
        Runnable before = new Runnable() {@Override public void run() { System.out.println("Running task 1");}};
        before.run();
        Runnable after = () -> System.out.println("Running task 2");
        after.run();
    }

}
