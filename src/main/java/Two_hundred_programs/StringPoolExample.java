package Two_hundred_programs;

public class StringPoolExample {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");
        System.out.println("a == b (pool): " + (a == b));
        System.out.println("a == c (heap): " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));
    }
}
