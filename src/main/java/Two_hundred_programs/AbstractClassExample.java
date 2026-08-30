package Two_hundred_programs;

abstract class Shape2 {
    abstract double area();
    void describe() { System.out.println("Area is " + area()); }
}
class Circle2 extends Shape2 {
    double radius = 5;
    double area() { return Math.PI * radius * radius; }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        new Circle2().describe();
    }
}