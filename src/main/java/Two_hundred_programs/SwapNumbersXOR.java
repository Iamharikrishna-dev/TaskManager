package Two_hundred_programs;

public class SwapNumbersXOR {
    public static void main(String[] args) {
        int a = 5, b = 9;
        a = a ^ b; b = a ^ b; a = a ^ b;
        System.out.println("a=" + a + " b=" + b);
    }
}