package Two_hundred_programs;

public class ArrayIndexExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }
    }
}