package Two_hundred_programs;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 29, count = 0;
        while (n > 0) { count += (n & 1); n >>= 1; }
        System.out.println("Set bits: " + count);
    }
}