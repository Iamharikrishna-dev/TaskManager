package Two_hundred_programs;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("abc123");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}