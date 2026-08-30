package Two_hundred_programs;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        System.out.println((n & (n - 1)) == 0 ? n + " is a power of two" : n + " is not");
    }
}