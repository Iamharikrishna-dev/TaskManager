package Two_hundred_programs;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = 0;
        for (int x : arr) max = Math.max(max, x);
        int[] count = new int[max + 1];
        for (int x : arr) count[x]++;
        int idx = 0;
        for (int i = 0; i <= max; i++) while (count[i]-- > 0) arr[idx++] = i;
        System.out.println(java.util.Arrays.toString(arr));
    }
}