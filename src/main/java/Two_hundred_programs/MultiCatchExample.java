package Two_hundred_programs;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
        }
    }
}