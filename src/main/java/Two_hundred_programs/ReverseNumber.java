package Two_hundred_programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456, rev = 0;
        while (n != 0) { rev = rev * 10 + n % 10; n /= 10; }
        System.out.println("Reversed: " + rev);
    }
}