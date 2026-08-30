package Two_hundred_programs;

public class StringBuilderPalindromeCheck {
    public static void main(String[] args) {
        String s = "level";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reversed) ? s + " is a palindrome" : s + " is not a palindrome");
    }
}
