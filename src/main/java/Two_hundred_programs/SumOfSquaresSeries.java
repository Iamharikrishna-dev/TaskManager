package Two_hundred_programs;

public class SumOfSquaresSeries {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) sum += i * i;
        System.out.println("Sum of squares: " + sum);
    }
}