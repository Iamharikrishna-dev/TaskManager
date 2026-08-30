package Two_hundred_programs;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int temp = n, sum = 0, digits = String.valueOf(n).length();
            while (temp > 0) { sum += Math.pow(temp % 10, digits); temp /= 10; }
            if (sum == n) System.out.print(n + " ");
        }
    }
}