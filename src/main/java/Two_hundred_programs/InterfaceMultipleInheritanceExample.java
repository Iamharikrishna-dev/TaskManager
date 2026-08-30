package Two_hundred_programs;

interface A2 { default void hello() { System.out.println("Hello from A2"); } }
interface B2 { default void hi() { System.out.println("Hi from B2"); } }
class C2 implements A2, B2 {}
public class InterfaceMultipleInheritanceExample {
    public static void main(String[] args) {
        C2 c = new C2();
        c.hello(); c.hi();
    }
}