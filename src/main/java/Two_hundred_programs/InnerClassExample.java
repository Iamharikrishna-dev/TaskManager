package Two_hundred_programs;

class Outer2 {
    class Inner2 { void msg() { System.out.println("Inner class method"); } }
}
public class InnerClassExample {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner2 inner = outer.new Inner2();
        inner.msg();
    }
}