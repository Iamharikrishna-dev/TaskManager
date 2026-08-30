package Two_hundred_programs1;

public class StringPalindromeNormal {
    public static void main(String[] args) {
        String s = "level";
        boolean ok = true;
        for (int i = 0, j = s.length()-1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j)) { ok = false; break; }
        System.out.println(ok ? "Palindrome" : "Not Palindrome");
    }
}
