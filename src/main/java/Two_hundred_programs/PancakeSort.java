package Two_hundred_programs;

public class PancakeSort {
    static void flip(int[] arr, int k) {
        int left = 0;
        while (left < k) { int t = arr[left]; arr[left] = arr[k]; arr[k] = t; left++; k--; }
    }
    public static void main(String[] args) {
        int[] arr = {23, 10, 20, 5, 68};
        for (int size = arr.length - 1; size > 0; size--) {
            int maxIdx = 0;
            for (int i = 1; i <= size; i++) if (arr[i] > arr[maxIdx]) maxIdx = i;
            if (maxIdx != size) { flip(arr, maxIdx); flip(arr, size); }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}