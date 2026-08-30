package Two_hundred_programs;

public class RecursiveArraySum {
    static int sum(int[] arr, int n) { return n == 0 ? 0 : arr[n - 1] + sum(arr, n - 1); }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sum(arr, arr.length));
    }
}