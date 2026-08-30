package Two_hundred_programs;

class Base2 { int value = 10; void show() { System.out.println("Base show"); } }
class Derived2 extends Base2 {
    int value = 20;
    void show() { super.show(); System.out.println("Base value: " + super.value + ", Derived value: " + value); }
}
public class SuperKeywordExample {
    public static void main(String[] args) {
        new Derived2().show();
    }
}