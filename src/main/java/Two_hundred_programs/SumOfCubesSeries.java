package Two_hundred_programs;

public class SumOfCubesSeries {
    public static void main(String[] args) {
        int n = 10; long sum = 0;
        for (int i = 1; i <= n; i++) sum += (long) i * i * i;
        System.out.println("Sum of cubes: " + sum);
    }
}