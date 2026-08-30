package Two_hundred_programs;

public class ZigzagPattern {
    public static void main(String[] args) {
        int rows = 3, cols = 12;
        int[][] grid = new int[rows][cols];
        int r = 0;
        boolean down = false;
        for (int c = 0; c < cols; c++) {
            grid[r][c] = 1;
            if (r == 0 || r == rows - 1) down = !down;
            r += down ? 1 : -1;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print(grid[i][j] == 1 ? "*" : " ");
            System.out.println();
        }
    }
}