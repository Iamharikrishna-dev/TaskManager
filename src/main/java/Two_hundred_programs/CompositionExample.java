package Two_hundred_programs;

class Engine2 { void start() { System.out.println("Engine starts"); } }
class Car3 {
    private Engine2 engine = new Engine2();
    void drive() { engine.start(); System.out.println("Car drives"); }
}
public class CompositionExample {
    public static void main(String[] args) {
        new Car3().drive();
    }
}