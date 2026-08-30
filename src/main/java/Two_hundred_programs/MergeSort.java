package Two_hundred_programs;

public class MergeSort {
    static void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        sort(arr, l, m); sort(arr, m + 1, r);
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        sort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}