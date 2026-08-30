package Two_hundred_programs;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7, index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == target) { index = i; break; }
        System.out.println("Index: " + index);
    }
}