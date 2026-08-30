package Two_hundred_programs;

public class GCDEuclidean {
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) {
        System.out.println("GCD: " + gcd(48, 18));
    }
}