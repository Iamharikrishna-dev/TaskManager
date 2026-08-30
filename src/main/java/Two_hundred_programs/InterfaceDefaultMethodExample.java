package Two_hundred_programs;

interface Greeter {
    default void greet() { System.out.println("Hello from default method"); }
}
class Person2 implements Greeter {}
public class InterfaceDefaultMethodExample {
    public static void main(String[] args) {
        new Person2().greet();
    }
}