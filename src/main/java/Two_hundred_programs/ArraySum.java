package Two_hundred_programs;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Sum: " + sum);
    }
}