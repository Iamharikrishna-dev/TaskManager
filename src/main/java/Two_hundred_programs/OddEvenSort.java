package Two_hundred_programs;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1, 9};
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length - 1; i += 2)
                if (arr[i] > arr[i + 1]) { int t = arr[i]; arr[i] = arr[i + 1]; arr[i + 1] = t; sorted = false; }
            for (int i = 0; i < arr.length - 1; i += 2)
                if (arr[i] > arr[i + 1]) { int t = arr[i]; arr[i] = arr[i + 1]; arr[i + 1] = t; sorted = false; }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}