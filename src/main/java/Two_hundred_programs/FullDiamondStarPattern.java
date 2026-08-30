package Two_hundred_programs;

public class FullDiamondStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = -n; i <= n; i++) {
            int stars = n - Math.abs(i);
            for (int s = 0; s < Math.abs(i); s++) System.out.print(" ");
            for (int j = 0; j <= stars; j++) System.out.print("* ");
            System.out.println();
        }
    }
}