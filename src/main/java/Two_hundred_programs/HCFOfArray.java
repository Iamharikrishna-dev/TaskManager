package Two_hundred_programs;

public class HCFOfArray {
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    public static void main(String[] args) {
        int[] arr = {24, 36, 60};
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) result = gcd(result, arr[i]);
        System.out.println("HCF: " + result);
    }
}