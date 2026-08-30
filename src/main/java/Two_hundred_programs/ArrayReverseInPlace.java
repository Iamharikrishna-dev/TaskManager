package Two_hundred_programs;

public class ArrayReverseInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}