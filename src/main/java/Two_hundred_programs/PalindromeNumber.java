package Two_hundred_programs;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321, orig = n, rev = 0;
        while (n > 0) { rev = rev * 10 + n % 10; n /= 10; }
        System.out.println(rev == orig ? "Palindrome" : "Not Palindrome");
    }
}