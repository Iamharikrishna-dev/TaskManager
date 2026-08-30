package Two_hundred_programs;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) { int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t; }
        System.out.println(java.util.Arrays.toString(arr));
    }
}