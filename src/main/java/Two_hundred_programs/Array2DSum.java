package Two_hundred_programs;

public class Array2DSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int[] row : mat) for (int x : row) sum += x;
        System.out.println("Sum: " + sum);
    }
}