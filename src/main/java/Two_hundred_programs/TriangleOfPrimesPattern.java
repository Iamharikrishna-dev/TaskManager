package Two_hundred_programs;

public class TriangleOfPrimesPattern {
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) if (num % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int rows = 5, count = 0, num = 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                while (!isPrime(num)) num++;
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}