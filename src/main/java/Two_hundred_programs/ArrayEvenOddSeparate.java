package Two_hundred_programs;

public class ArrayEvenOddSeparate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        StringBuilder even = new StringBuilder(), odd = new StringBuilder();
        for (int x : arr) { if (x % 2 == 0) even.append(x + " "); else odd.append(x + " "); }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}