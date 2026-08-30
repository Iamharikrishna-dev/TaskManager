package Two_hundred_programs;

public class RecursivePower {
    static long power(int base, int exp) { return exp == 0 ? 1 : base * power(base, exp - 1); }
    public static void main(String[] args) {
        System.out.println("Power: " + power(2, 10));
    }
}