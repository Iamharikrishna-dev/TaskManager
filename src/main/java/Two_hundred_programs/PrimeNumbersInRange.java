package Two_hundred_programs;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int low = 2, high = 50;
        for (int n = low; n <= high; n++) {
            boolean prime = true;
            for (int i = 2; i * i <= n; i++) if (n % i == 0) { prime = false; break; }
            if (prime) System.out.print(n + " ");
        }
    }
}