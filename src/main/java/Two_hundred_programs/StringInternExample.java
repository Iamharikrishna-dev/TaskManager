package Two_hundred_programs;

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = new String("hello").intern();
        String s2 = "hello";
        System.out.println("Interned s1 == s2: " + (s1 == s2));
    }
}
