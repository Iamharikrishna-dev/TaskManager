package Two_hundred_programs;

public class RemoveWhitespaceRegex {
    public static void main(String[] args) {
        String s = "  Java   is   fun  ";
        System.out.println(s.replaceAll("\\s+", ""));
    }
}