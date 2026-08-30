package Two_hundred_programs;

class Counter2 {
    static int count = 0;
    Counter2() { count++; }
}
public class StaticVsInstanceExample {
    public static void main(String[] args) {
        new Counter2(); new Counter2(); new Counter2();
        System.out.println("Instances created: " + Counter2.count);
    }
}