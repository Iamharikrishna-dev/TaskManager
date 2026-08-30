package Two_hundred_programs;

public class RecursiveSum {
    static int sum(int n) { return n == 0 ? 0 : n + sum(n - 1); }
    public static void main(String[] args) {
        System.out.println("Sum 1..10: " + sum(10));
    }
}