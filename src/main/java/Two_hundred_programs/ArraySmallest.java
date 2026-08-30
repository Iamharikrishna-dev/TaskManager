package Two_hundred_programs;

public class ArraySmallest {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 2, 9};
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        System.out.println("Smallest: " + min);
    }
}