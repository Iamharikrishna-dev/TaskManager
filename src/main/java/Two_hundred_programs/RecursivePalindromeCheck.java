package Two_hundred_programs;

public class RecursivePalindromeCheck {
    static boolean isPalin(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalin(s, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalin(s, 0, s.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
}