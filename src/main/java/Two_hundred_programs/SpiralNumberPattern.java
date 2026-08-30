package Two_hundred_programs;

public class SpiralNumberPattern {
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, val = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) mat[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) mat[i][right] = val++;
            right--;
            for (int i = right; i >= left && top <= bottom; i--) mat[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--) mat[i][left] = val++;
            left++;
        }
        for (int[] row : mat) {
            for (int x : row) System.out.print(x + "\t");
            System.out.println();
        }
    }
}