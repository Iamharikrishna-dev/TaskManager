package Two_hundred_programs;

public class SwapFirstLastChar {
    public static void main(String[] args) {
        String s = "hello";
        if (s.length() < 2) { System.out.println(s); return; }
        char[] arr = s.toCharArray();
        char temp = arr[0]; arr[0] = arr[arr.length - 1]; arr[arr.length - 1] = temp;
        System.out.println(new String(arr));
    }
}