package Two_hundred_programs;

public class RecursiveStringReverse {
    static String reverse(String s) { return s.isEmpty() ? s : reverse(s.substring(1)) + s.charAt(0); }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}