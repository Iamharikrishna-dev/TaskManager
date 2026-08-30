package Two_hundred_programs;

public class RecursiveBinarySearch {
    static int search(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        return arr[mid] < target ? search(arr, mid + 1, high, target) : search(arr, low, mid - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Index: " + search(arr, 0, arr.length - 1, 9));
    }
}