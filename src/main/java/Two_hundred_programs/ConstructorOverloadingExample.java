package Two_hundred_programs;

class Box2 {
    int side;
    Box2() { side = 1; }
    Box2(int s) { side = s; }
    int volume() { return side * side * side; }
}
public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        System.out.println(new Box2().volume());
        System.out.println(new Box2(3).volume());
    }
}