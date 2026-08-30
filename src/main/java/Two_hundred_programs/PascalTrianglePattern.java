package Two_hundred_programs;

public class PascalTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            long val = 1;
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}