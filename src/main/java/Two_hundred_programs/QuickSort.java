package Two_hundred_programs;

public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high], i = low - 1;
            for (int j = low; j < high; j++)
                if (arr[j] < pivot) { i++; int t = arr[i]; arr[i] = arr[j]; arr[j] = t; }
            int t = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = t;
            sort(arr, low, i); sort(arr, i + 2, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}