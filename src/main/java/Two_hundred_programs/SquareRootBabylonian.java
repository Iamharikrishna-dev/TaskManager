package Two_hundred_programs;

public class SquareRootBabylonian {
    public static void main(String[] args) {
        double n = 50, guess = n / 2;
        for (int i = 0; i < 20; i++) guess = (guess + n / guess) / 2;
        System.out.println("Square root: " + guess);
    }
}