package Two_hundred_programs;

public class SumOfSeriesNaturalNumbers {
    public static void main(String[] args) {
        int n = 20, sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);
    }
}