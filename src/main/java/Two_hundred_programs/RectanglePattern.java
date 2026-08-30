package Two_hundred_programs;

public class RectanglePattern {
    public static void main(String[] args) {
        int rows = 4, cols = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print("#");
            System.out.println();
        }
    }
}