package Two_hundred_programs;

interface Flyable { void fly(); }
interface Swimmable { void swim(); }
class Duck implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flies"); }
    public void swim() { System.out.println("Duck swims"); }
}
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly(); d.swim();
    }
}