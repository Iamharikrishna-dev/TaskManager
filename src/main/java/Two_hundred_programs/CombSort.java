package Two_hundred_programs;

public class CombSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        int gap = arr.length;
        boolean swapped = true;
        while (gap != 1 || swapped) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            swapped = false;
            for (int i = 0; i + gap < arr.length; i++)
                if (arr[i] > arr[i + gap]) { int t = arr[i]; arr[i] = arr[i + gap]; arr[i + gap] = t; swapped = true; }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}