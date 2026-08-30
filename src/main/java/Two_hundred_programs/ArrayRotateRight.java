package Two_hundred_programs;

public class ArrayRotateRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2, n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) result[(i + d) % n] = arr[i];
        System.out.println(java.util.Arrays.toString(result));
    }
}