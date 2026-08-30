package Two_hundred_programs;

public class ReverseVowelsInString {
    static boolean isVowel(char c) { return "aeiouAEIOU".indexOf(c) >= 0; }
    public static void main(String[] args) {
        char[] arr = "programming languages".toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!isVowel(arr[left])) { left++; continue; }
            if (!isVowel(arr[right])) { right--; continue; }
            char t = arr[left]; arr[left] = arr[right]; arr[right] = t;
            left++; right--;
        }
        System.out.println(new String(arr));
    }
}
