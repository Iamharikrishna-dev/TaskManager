package Two_hundred_programs;

public class LCMUsingGCD {
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println("LCM: " + (a * b / gcd(a, b)));
    }
}