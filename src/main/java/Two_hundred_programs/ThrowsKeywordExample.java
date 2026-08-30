package Two_hundred_programs;

public class ThrowsKeywordExample {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) throw new IllegalArgumentException("Age must be 18 or above");
        System.out.println("Age valid");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}