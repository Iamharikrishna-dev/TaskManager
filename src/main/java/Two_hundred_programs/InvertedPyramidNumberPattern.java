package Two_hundred_programs;

public class InvertedPyramidNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}