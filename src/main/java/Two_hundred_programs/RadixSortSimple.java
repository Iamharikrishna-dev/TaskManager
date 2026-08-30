package Two_hundred_programs;

public class RadixSortSimple {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int max = 0;
        for (int x : arr) max = Math.max(max, x);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] output = new int[arr.length];
            int[] count = new int[10];
            for (int x : arr) count[(x / exp) % 10]++;
            for (int i = 1; i < 10; i++) count[i] += count[i - 1];
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[--count[digit]] = arr[i];
            }
            System.arraycopy(output, 0, arr, 0, arr.length);
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}