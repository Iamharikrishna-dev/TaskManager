package Two_hundred_programs;

public class StringCharAtExample {
    public static void main(String[] args) {
        String s = "programming";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + (i < s.length() - 1 ? "-" : "\n"));
        }
    }
}
