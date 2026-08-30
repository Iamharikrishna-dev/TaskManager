package Two_hundred_programs;

abstract class Greeting2 { abstract void greet(); }
public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting2 g = new Greeting2() { void greet() { System.out.println("Hello from anonymous class"); } };
        g.greet();
    }
}