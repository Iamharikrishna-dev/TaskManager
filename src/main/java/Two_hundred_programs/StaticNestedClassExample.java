package Two_hundred_programs;

class Outer3 {
    static class Nested3 { void show() { System.out.println("Static nested class"); } }
}
public class StaticNestedClassExample {
    public static void main(String[] args) {
        new Outer3.Nested3().show();
    }
}