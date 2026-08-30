package Two_hundred_programs;

class Vehicle2 { void move() { System.out.println("Vehicle moves"); } }
class Car2 extends Vehicle2 { void move() { System.out.println("Car drives"); } }
public class PolymorphismOverridingExample {
    public static void main(String[] args) {
        Vehicle2 v = new Car2();
        v.move();
    }
}