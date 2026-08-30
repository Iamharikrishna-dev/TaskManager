package Two_hundred_programs;

public class ArrayLeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3, n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) temp[i] = arr[(i + d) % n];
        System.arraycopy(temp, 0, arr, 0, n);
        System.out.println(java.util.Arrays.toString(arr));
    }
}