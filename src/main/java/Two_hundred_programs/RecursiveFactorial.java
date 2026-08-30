package Two_hundred_programs;

public class RecursiveFactorial {
    static long fact(int n) { return n <= 1 ? 1 : n * fact(n - 1); }
    public static void main(String[] args) {
        System.out.println("Factorial: " + fact(6));
    }
}