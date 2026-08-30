package Two_hundred_programs;

public class ReverseStringInPlaceSwap {
    public static void main(String[] args) {
        char[] arr = "swap in place".toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        System.out.println(new String(arr));
    }
}
