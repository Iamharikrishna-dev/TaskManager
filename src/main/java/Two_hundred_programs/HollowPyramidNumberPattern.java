package Two_hundred_programs;

public class HollowPyramidNumberPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) System.out.print((j % 2 == 0) ? "0" : "1");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}